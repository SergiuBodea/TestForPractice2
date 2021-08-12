package com.vytrack.step_definitions;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("\tthis sis coming from BEFORE");
    }
    @After
    public void tearUp(Scenario scenario){
        //take a screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            //attach screenshot to report
            scenario.attach(screenshot,"image/png", "screenshot");

        }

        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }




    @Before("@db")
    public void setupdb(){
        System.out.println("\t connecting to database ... ");
    }
     @After("@db")
    public void tearUpdb(){
         System.out.println("\t disconnecting to database ... ");
    }


}
