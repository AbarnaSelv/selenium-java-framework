package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features  = {"src/test/java/features/addToCart.feature"},
		dryRun = !true, // it wont execute the code but it checks whether the feature file and step definition file is matched
		glue = {"steps","Hooks"}, // adding the folders to get process
		snippets = SnippetType.CAMELCASE, // in order to change a method from user_login to this userLogin
		monochrome = true, // to remove junk characters
		plugin = {"pretty",
				"html:reports",
				"json:reports/result.json",
				"junit:reports/result.xml"
				}, // to get a detailed log - pretty , for html - html:folder name , for json - foldername /filename.format, simalar for xml as well
	// no need to create folder it will generate automatically after running , refresh the project, you will the folder added
		
		tags = {"@smoke and @reg"}
		)

// it will run when there is @test , here there is default methods so extending it to run
public class Runner extends AbstractTestNGCucumberTests{

}
