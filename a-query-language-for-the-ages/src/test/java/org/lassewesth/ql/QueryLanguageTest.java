package org.lassewesth.ql;

import org.junit.Test;
import org.lassewesth.storage.GrandBouquet;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

public class QueryLanguageTest {
    @Test
    public void shouldExecuteQuery() throws Exception {
        String result = new QueryLanguage(mock(GrandBouquet.class)).execute("hello, world!\n");
    }
}
