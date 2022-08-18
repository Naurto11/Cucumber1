package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JVM;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.step",plugin ={"html:target\\Reports", "json:target\\Reports\\output.json",
		"junit:target\\Reports\\fb.xml"})
public class Runner {
	
	@AfterClass
	public static void jvmReportGenerate() {

		
		JVM.genarateJvmReport(System.getProperty("user.dir")+ "\\target\\Reports\\output.json");
	
		System.out.println("done");
	
	}
	
	
}
