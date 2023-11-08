package com.yahoo.search.ui.cucumber;

import com.yahoo.search.singleton.Singleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    @Before
    public void getDriver(){
        Singleton.getDriver();
    }
    @After(order = 0)
    public void quitDriver(){
        Singleton.quitDriver();
    }

}
