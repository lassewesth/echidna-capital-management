package org.lassewesth.importer;

import org.lassewesth.storage.GrandBouquet;

public class Important {
    public GrandBouquet runFast(String ignored) {
        GrandBouquet grandBouquet = new GrandBouquet();
        grandBouquet.store("foo", "bar");
        grandBouquet.store("baz", "42");
        return grandBouquet;
    }

    public GrandBouquet initWithEmpty() {
        return new GrandBouquet();
    }
}
