package org.lassewesth.ql;

import org.lassewesth.storage.GrandBouquet;

public class QueryLanguage {
    private final GrandBouquet grandBouquet;

    public QueryLanguage(GrandBouquet grandBouquet) {
        this.grandBouquet = grandBouquet;
    }

    public String execute(String query) {
        return grandBouquet.fetch(query);
    }
}
