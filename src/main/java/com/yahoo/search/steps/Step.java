package com.yahoo.search.steps;

import com.yahoo.search.po.SearchPage;

import static com.yahoo.search.data.Data.SEARCH_QUERY;

public class Step {
    public static void inputSearchLineSendKeys() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputSearchLineSendKeys(SEARCH_QUERY);
    }
}
