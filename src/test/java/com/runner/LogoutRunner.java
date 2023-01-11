package com.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true, plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber.json", },

		features = { "src/test/resources/AutomationExerciseLogout.feature" }, 
		glue = { "com.stepdef" }, // package name
		monochrome = true, // remove all ?? & console will be easily readable
		dryRun = true // check feature file
		//strict = true // check stepdef
// ,tags= {"@Function"}

)

public class LogoutRunner {

	
	
}
