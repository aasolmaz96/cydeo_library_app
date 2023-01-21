package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",       //"src/test/resources/features" - alternative way
        //using classpath doesn't show the whole feature path in cucumber report

        glue = "com/cydeo/library/step_definitions",
        plugin = {"html:target/cucumber-reports.html",
                "pretty",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"
                },
        dryRun = false,
        tags = ""       //"@tag1 and @tag2"   -   "@tag1 and not @tag2"     -       "@tag1 or @tag2")
)

public class CukesRunner {

}

