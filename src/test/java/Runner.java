

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {""},plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class Runner {

}
