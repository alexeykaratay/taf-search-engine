package com.yahoo.search.po;

import com.yahoo.search.singleton.Singleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.yahoo.search.url.Url.URL;

public class SearchPage {
    private WebDriver driver;
    private JavascriptExecutor js;
    @FindBy(xpath = "//input[@id='yschsp']")
    WebElement inputSearchLineLocator;

    public SearchPage() {
        this.driver = Singleton.getDriver();
        PageFactory.initElements(Singleton.getDriver(), this);
        js = (JavascriptExecutor) Singleton.getDriver();
    }

    public void openSearchPage() {
        driver.get(URL);
    }

    public void inputSearchLineSendKeys(String objectSearch) {
        js.executeScript("arguments[0].value = arguments[1];", inputSearchLineLocator, objectSearch);
        inputSearchLineLocator.sendKeys(Keys.RETURN);
    }
}
