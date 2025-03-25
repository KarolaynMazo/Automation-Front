package co.com.test2.task;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test2.userinterface.AutomationPractice.ICON_SEARCH;
import static co.com.test2.userinterface.AutomationPractice.SEARCH;
import static co.com.test2.utils.ConstantsNum.NINE_NUM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@AllArgsConstructor
public class Product implements Task {
    String product;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEARCH, isVisible()).forNoMoreThan(NINE_NUM).seconds(),
                Click.on(SEARCH),
                Enter.theValue(product).into(SEARCH),
                Click.on(ICON_SEARCH)

        );
    }

    public static Product with(String data) {
        return Tasks.instrumented(Product.class, data);
    }

}
