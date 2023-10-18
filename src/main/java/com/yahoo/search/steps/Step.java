package com.yahoo.search.steps;

import com.yahoo.search.po.SearchPage;


public class Step {
    public static final String SEARCH_QUERY = "Минск";

    public static void inputSearchLineSendKeys() {
        SearchPage searchPage = new SearchPage();
        searchPage.inputSearchLineSendKeys(SEARCH_QUERY);
    }
}
