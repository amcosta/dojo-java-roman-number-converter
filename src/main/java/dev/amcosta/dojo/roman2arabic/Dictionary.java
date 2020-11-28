package dev.amcosta.dojo.roman2arabic;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    Map<String, Integer> list = new HashMap<>();

    Dictionary() {
        this.list.put("I", 1);
        this.list.put("V", 5);
        this.list.put("X", 10);
        this.list.put("L", 50);
        this.list.put("C", 100);
        this.list.put("D", 500);
        this.list.put("M", 1000);
    }

    public Integer get(String key) {
        return this.list.get(key);
    }

    public Integer get(char key) {
        return this.get(String.valueOf(key));
    }
}
