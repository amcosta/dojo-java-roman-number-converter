package dev.amcosta.dojo.converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Roman2Arabic {

    String symbols;
    char[] characters;
    Integer pointer = 0;

    Map<String, Integer> dictionary = new HashMap<>();

    public Roman2Arabic(String symbols) {
        this.symbols = symbols;
        this.characters = symbols.toCharArray();

        this.dictionary.put("I", 1);
        this.dictionary.put("V", 5);
        this.dictionary.put("X", 10);
        this.dictionary.put("L", 50);
        this.dictionary.put("C", 100);
        this.dictionary.put("D", 500);
        this.dictionary.put("M", 1000);


    }

    public int convert() {
        Integer total = 0;

        for (int i = 0; i < this.characters.length; i++) {
            Integer currentValue = this.dictionary.getOrDefault(String.valueOf(this.characters[i]), 0);
            Integer previousValue = i == 0 ? 0 : this.dictionary.getOrDefault(String.valueOf(this.characters[i - 1]), 0);

            if (currentValue > previousValue) {
                total = currentValue - previousValue;
            } else {
                total += currentValue;
            }
        }

        return total;
    }
}
