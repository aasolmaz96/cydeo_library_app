package com.cydeo.library.step_definitions;

import com.cydeo.library.utilities.ConfigReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before
    public void setup(Scenario scenario){
        Driver.getDriver().get(ConfigReader.read("url"));
    }


    //@Before (order = 1)
//    public void setupScenario(){
//        System.out.println("====Setting up browser using cucumber @Before");
//    }
//
//    //@Before (value = "@Login", order = 2)
//    public void setupScenarioForLogins(){
//        System.out.println("====this will only apply to scenarios with @Login tag");
//    }
//
//    //@Before (value = "@Login", order = 0)
//    public void setupForDatabaseScenarios(){
//        System.out.println("====this will only apply to scenarios with @Login tag");
//    }

    @After
    public void teardown(Scenario scenario){

        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        Driver.closeDriver();

    }



}
