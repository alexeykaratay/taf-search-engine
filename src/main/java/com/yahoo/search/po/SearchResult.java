package com.yahoo.search.po;

import com.yahoo.search.singleton.Singleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResult {
    private WebDriver driver;
    private JavascriptExecutor js;
    @FindBy(xpath = "//a[@class=' d-ib fz-20 lh-26 td-hu tc va-bot mxw-100p']")
    List<WebElement> searchResultLocator;

    public SearchResult() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(Singleton.getDriver(), this);
        js = (JavascriptExecutor) Singleton.getDriver();
    }

    public List<WebElement> getSearchResult() {
        return searchResultLocator;
    }
}
