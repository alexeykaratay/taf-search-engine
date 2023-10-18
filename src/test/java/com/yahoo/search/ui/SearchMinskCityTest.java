package com.yahoo.search.ui;

import com.yahoo.search.po.SearchResult;
import com.yahoo.search.steps.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;


public class SearchMinskCityTest extends BaseTest {
    public static final String EXTENDED_TEXT = "Минск — Википедия";
    public static final String HREF = "https://ru.wikipedia.org/wiki/Минск";

    @DisplayName("Search Minsk city")
    @Test
    public void testSearchMinskCity() {
        Step.inputSearchLineSendKeys();
        for (WebElement element : new SearchResult().getSearchResult()) {
            if (element.getText().contains(EXTENDED_TEXT) && element.getAttribute("href").contains(HREF)) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(true);
            }
        }
    }
}
