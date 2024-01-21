package Cucumber.options;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Feature",
		glue= {"stepDefination"},
		tags= {"@Smoke"}
	//	tags= {"@Smoke and @Regression"}
	//	tags= {"@Smoke or @Regression"}
	//	tags= {"@Smoke","@Regression"},
	//	tags= {"@Only"},
	//	plugin= {"pretty","json:target/JsonReport/jsonrp.json"},
	//	plugin= {"pretty","html:target/HTMLReport/ht.html"}
				
		
		)
public class TestRunner {
	

}
