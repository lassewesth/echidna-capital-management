package org.lassewesth.storage;

import java.util.HashMap;
import java.util.Map;

public class GrandBouquet {
    private final Map<String, String> stuff = new HashMap<>();

    public void store(String key, String value) {
        stuff.put(key, value);
    }

    public String fetch(String key) {
        return stuff.get(key);
    }
}
