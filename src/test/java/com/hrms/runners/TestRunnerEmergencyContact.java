package com.hrms.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/hrms/steps"
		,dryRun=false
		,plugin= {"pretty"}
		,monochrome=true
		,tags= {"@smoke19"}
		)




public class TestRunnerEmergencyContact {
}

