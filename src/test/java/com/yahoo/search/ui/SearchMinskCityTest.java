package com.yahoo.search.ui;

import com.yahoo.search.po.SearchResult;
import com.yahoo.search.steps.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.yahoo.search.data.Data.EXTENDED_TEXT;


public class SearchMinskCityTest extends BaseTest {
    @DisplayName("Search Minsk city")
    @Test
    public void testSearchMinskCity() {
        Step.inputSearchLineSendKeys();
        SearchResult searchResult = new SearchResult();
        System.out.println(searchResult.getSearchResultText());
        for (WebElement element: searchResult.getSearchResult()){
                if(element.getText().contains(EXTENDED_TEXT)){
                    Assertions.assertTrue(true);
                    return;

                }  else Assertions.fail("Error!!!");
        }




}
}
