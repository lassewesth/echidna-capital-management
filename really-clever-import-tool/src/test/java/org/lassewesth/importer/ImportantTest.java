package org.lassewesth.importer;

import org.junit.Test;
import org.lassewesth.storage.GrandBouquet;

public class ImportantTest {
    @Test
    public void shouldImportEverything() throws Exception {
        GrandBouquet grandBouquet = new Important().run("crap.csv");
    }
}
