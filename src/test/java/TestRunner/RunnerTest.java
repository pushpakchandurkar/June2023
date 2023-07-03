package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features= {"AllFeatureFiles"},
		glue= {"StepDefination"},
		dryRun=false,
		monochrome=true,
		plugin= {
				"html:Reports/a.html",
				"html:Reports/abc.html",
				"json:Reports/abc.json",
				"junit:Reports/abc.xml",
				"pretty:Reports/abc.txt"

				
		}
)

public class RunnerTest {

}
