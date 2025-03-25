package co.com.test2.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.com.test2.stepdefinitions",
        features = "src/test/resources/features/Test2.feature",
        snippets = SnippetType.CAMELCASE
)

public class Test2 {

}
