package org.lassewesth.importer;

import org.lassewesth.storage.GrandBouquet;

public class Important {
    public GrandBouquet run(String ignored) {
        GrandBouquet grandBouquet = new GrandBouquet();
        grandBouquet.store("foo", "bar");
        grandBouquet.store("baz", "42");
        return grandBouquet;
    }
}
