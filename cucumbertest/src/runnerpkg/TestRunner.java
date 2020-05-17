package runnerpkg;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature"
				, glue = {"stepDef"}
				//,dryRun = true
				//,monochrome = true	
				,format = "html:F:/Cucumber files/HTML"
		)	
		//format = {
			//	"json:target/cucumber/wikipedia.json",
				//"html:target/cucumber/wikipedia.html",
				//"pretty"
	//	},
		//tags = {"~@ignored"}
//)
public class TestRunner {	

}
