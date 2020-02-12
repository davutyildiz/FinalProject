package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunner_AddJobDetails {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/features"
			,glue="com/hrms/steps"
			,dryRun=false
			,plugin= {"pretty"}
			,monochrome=true
			,tags= {"@Andrei"}
			)

	public class TestRunner {
	}

}

//history = what commands I used recently
//clear = clears the screen

//pwd = where am I?
//ls = list everything inside current folder
//cd eclipse-workspace
//ls = list everything inside current folder
//cd njgeeks
//pwd = where am I?

//now I use git commands
//git pull = pulls everything from remote repo, to local repository

//git status = What changes I made?
//git add . = Adds all files to the staging area. They are ready to be committed
//git status = What changes I made?
//git commit -m "some comment" = Puts staged files to local repo
//git push = Will send changes to remote repo, github