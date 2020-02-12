<<<<<<< HEAD:src/test/java/com/hrms/runners/TestRunnerEmergencyContact.java
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
=======
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




public class TestRunnerDavidBrown {
>>>>>>> 906e399aa7b18c72d4cc2162cf5449b8f2c06982:src/test/java/com/hrms/runners/TestRunnerDavidBrown.java
}