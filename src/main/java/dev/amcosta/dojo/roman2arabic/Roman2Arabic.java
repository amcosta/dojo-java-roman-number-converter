package dev.amcosta.dojo.roman2arabic;

public class Roman2Arabic {
    Pointer pointer;
    Dictionary dictionary;

    public Roman2Arabic(String symbols) {
        this.dictionary = new Dictionary();
        this.pointer = new Pointer(symbols);
    }

    public int convert() {
        int converted = 0;

        while (this.pointer.hasNext()) {
            int currentValue = this.dictionary.get(this.pointer.getCurrent());
            int previousValue = 0;

            try {
                previousValue = this.dictionary.get(this.pointer.getPrevious());
            } catch (ArrayIndexOutOfBoundsException ignored) {}

            if (currentValue > previousValue) {
                converted = currentValue - previousValue;
            } else {
                converted += currentValue;
            }

            this.pointer.next();
        }

        return converted;
    }
}
