package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\admin\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\feature\\Test.feature",
glue = {"stepDefination"} )
//html
//json
//text
//xml
public class TestRunner {

}
