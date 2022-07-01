package api.APIRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/apiFeatures",
        glue="api/stepdefinitions",
        tags="@a"  ,
        dryRun= false
)
class APIRunner {
}