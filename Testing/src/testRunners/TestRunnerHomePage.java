package testRunners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features= "src/features" , glue= {"StepDefinition"}
				,dryRun=false
				,monochrome=true
				,plugin= {"pretty","html:Reports"}
)

public class TestRunnerHomePage {

}

