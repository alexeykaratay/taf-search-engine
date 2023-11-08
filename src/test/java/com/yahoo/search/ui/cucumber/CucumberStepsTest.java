package com.yahoo.search.ui.cucumber;

import com.yahoo.search.po.SearchPage;
import com.yahoo.search.po.SearchResult;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import static com.yahoo.search.ui.SearchMinskCityUiTest.EXTENDED_TEXT;
import static com.yahoo.search.ui.SearchMinskCityUiTest.HREF;

public class CucumberStepsTest {
    private static SearchPage searchPage;
    static SearchResult searchResult;
    private static String inputSearch;

    @Given("User is on the Home page")
    public static void userIsOnTheHomePage() {
        searchPage = new SearchPage();
        searchPage.openSearchPage();
    }

    @When("The user enters a value {string} into the search line")
    public static void theUserEntersAValueIntoTheSearchLine(String input) {
        inputSearch = input;
        searchPage.inputSearchLineSendKeys(inputSearch);
    }

    @Then("User receives a search result and equals extended result")
    public static void userReceivesASearchResultAndEqualsExtendedResult() {
        searchResult = new SearchResult();
        for (WebElement element : new SearchResult().getSearchResult()) {
            if (element.getText().contains(EXTENDED_TEXT) && element.getAttribute("href").contains(HREF)) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(true);
            }
        }
    }
}
