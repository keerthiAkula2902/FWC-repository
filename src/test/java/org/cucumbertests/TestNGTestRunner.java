package org.cucumbertests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\U1133463\\eclipse-workspace\\FrameWorkCopy\\src\\test\\java\\org\\cucumbertests", glue = "org.cucumbertests", monochrome = true, plugin = {
		"html:target/cucumber.html" })
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
