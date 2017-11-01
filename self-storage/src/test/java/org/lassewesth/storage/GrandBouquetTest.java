package org.lassewesth.storage;

import org.junit.Test;

public class GrandBouquetTest {
    @Test
    public void shouldStoreStuff() throws Exception {
        new GrandBouquet().store("something", "nothing");
    }

    @Test
    public void shouldFetchStuff() throws Exception {
        String something = new GrandBouquet().fetch("something");
    }
}
