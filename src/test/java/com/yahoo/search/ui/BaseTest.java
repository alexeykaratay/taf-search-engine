package com.yahoo.search.ui;

import com.yahoo.search.po.SearchPage;
import com.yahoo.search.singleton.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void driverSetup(){
        SearchPage searchPage = new SearchPage();
        searchPage.searchPage();
    }

    @AfterEach
    public void driverClose(){
        Singleton.quitDriver();
    }
}
