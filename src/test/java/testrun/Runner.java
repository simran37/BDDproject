package testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/jaura/eclipse-workspace/MobileProject-BDD/src/test/java/featurepack",
glue = {"programBDD"},
plugin= {"pretty", "html:target/HTmlreports.html"}, monochrome=true, dryRun= true, tags= "@tag")




public class Runner {

}
