package org.lassewesth.importer;

import org.junit.Test;
import org.lassewesth.storage.GrandBouquet;

public class ImportantTest {
    @Test
    public void shouldImportEverything() throws Exception {
        GrandBouquet ignored = new Important().run("crap.csv");
    }

    @Test
    public void shouldImportSomething() throws Exception {
        GrandBouquet ignored = new Important().init();
    }
}
