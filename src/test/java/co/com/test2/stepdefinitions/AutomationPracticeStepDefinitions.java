package co.com.test2.stepdefinitions;

import co.com.test2.questions.ValidationMessage;
import co.com.test2.questions.ValidationProduct;
import co.com.test2.task.Product;
import co.com.test2.userinterface.AutomationPractice;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static co.com.test2.utils.ConstantString.URL_AP;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationPracticeStepDefinitions {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }


    @Given("{string} you want to navigate to the page")
    public void customerYouWantToNavigateToThePage(String customer) {
        theActor(customer).wasAbleTo(new OpenUrl(URL_AP));
    }
    

    @When("^enter the  information (.*)$")
    public void enterTheInformationProduct(String product) {
        theActorInTheSpotlight().attemptsTo(Product.with(product));
    }

    @Then("^should see the (.*)$")
    public void shouldSeeTheProduct(String product) {
        theActorInTheSpotlight().should(seeThat("The response of the service request is successful",
                ValidationProduct.with(product, AutomationPractice.Confirmation(product)), Matchers.is(true))
        );
    }
}
