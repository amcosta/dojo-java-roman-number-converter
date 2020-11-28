package dev.amcosta.dojo.roman2arabic;

public class Pointer {
    private Integer index = 0;
    private final char[] characters;

    public Pointer(String symbols) {
        this.characters = symbols.toCharArray();
    }

    public String getPrevious() {
        return String.valueOf(this.characters[this.index - 1]);
    }

    public String getCurrent() {
        return String.valueOf(this.characters[this.index]);
    }

    public void next() {
        this.index++;
    }

    public Integer length() {
        return this.characters.length;
    }

    public boolean hasNext() {
        return this.index < this.characters.length;
    }
}
