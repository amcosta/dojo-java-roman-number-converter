package dev.amcosta.dojo.converter;

import java.util.HashMap;
import java.util.Map;

public class Roman2Arabic {

    String symbols;

    Map<String, Integer> dictionary = new HashMap<>();

    public Roman2Arabic(String symbols) {
        this.symbols = symbols;

        this.dictionary.put("I", 1);
        this.dictionary.put("V", 5);
        this.dictionary.put("X", 10);
        this.dictionary.put("L", 50);
        this.dictionary.put("C", 100);
        this.dictionary.put("D", 500);
        this.dictionary.put("M", 1000);
    }

    public int convert() {
        return this.dictionary.get(this.symbols);
    }
}
