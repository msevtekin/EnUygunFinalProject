package com.enUygun.stepDefinitions;

import com.enUygun.utilities.ConfigurationReader;
import com.enUygun.utilities.Driver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;


public class Hooks {


    @BeforeMethod
    public void setUp() {
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {

        Driver.closeDriver();
    }
}
