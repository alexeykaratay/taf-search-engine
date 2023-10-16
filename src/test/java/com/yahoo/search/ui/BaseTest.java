package com.yahoo.search.ui;

import com.yahoo.search.po.SearchPage;
import com.yahoo.search.singleton.Singleton;
import com.yahoo.search.utils.Waiters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void driverSetup(){
        SearchPage searchPage = new SearchPage();
        searchPage.openSearchPage();

    }

    @AfterEach
    public void driverClose(){
        Singleton.quitDriver();
    }
}
