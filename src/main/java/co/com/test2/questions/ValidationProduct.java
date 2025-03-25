package co.com.test2.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test2.userinterface.FormPage.MESSAGE_CONFIRMATION;
import static co.com.test2.utils.ConstantsNum.FIFTEEN_NUM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationProduct implements Question<Boolean> {

    private final String message;
    private Target target;

    public ValidationProduct(String message, Target target) {
        this.message = message;
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(MESSAGE_CONFIRMATION, isVisible()).forNoMoreThan(FIFTEEN_NUM).seconds();
        return Text.of(target.of(message)).asString().toString().contains(message.toUpperCase());
    }


    public static ValidationProduct with(String message,Target target){
        return new ValidationProduct(message, target);
    }
}
