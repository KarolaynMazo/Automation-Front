package co.com.test2.questions;

import co.com.test2.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test2.userinterface.FormPage.MESSAGE_CONFIRMATION;
import static co.com.test2.utils.ConstantsNum.FIFTEEN_NUM;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationMessage implements Question<String> {

    Target target;
    private final String message;

    public ValidationMessage(Target target, String message) {
        this.target = target;
        this.message = message;
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(MESSAGE_CONFIRMATION, isVisible()).forNoMoreThan(FIFTEEN_NUM).seconds();
        return (Text.of(target.of(message)).asString().toString());
    }

    public static ValidationMessage with(Target target,String message){
        return new ValidationMessage(target,message);
    }
}
