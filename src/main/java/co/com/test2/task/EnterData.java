package co.com.test2.task;

import co.com.test2.models.Form;
import co.com.test2.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.logging.Logger;

import static co.com.test2.userinterface.FormPage.*;
import static co.com.test2.utils.ConstantString.*;
import static co.com.test2.utils.ConstantsNum.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class EnterData implements Task {

    private Form form;

    public EnterData(Map<String, String> data) {
        form = Form.builder()
                .name(data.get(_NAME))
                .lastName(data.get(_LAST_NAME))
                .email(data.get(_EMAIL))
                .gender(data.get(_GENDER))
                .mobile(data.get(_MOBILE))
                .subjects(data.get(_SUBJECTS))
                .hobbies(data.get(_HOBBIES))
                .address(data.get(_ADDRESS))
                .state(data.get(_STATE))
                .city(data.get(_CITY))
                .build();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormPage.NAME, isVisible()).forNoMoreThan(NINE_NUM).seconds(),
                Enter.theValue(form.getName()).into(NAME),
                Enter.theValue(form.getLastName()).into(LAST_NAME),
                WaitUntil.the(EMAIL, isVisible()).forNoMoreThan(TEN_NUM).seconds(),
                Enter.theValue(form.getEmail()).into(EMAIL),
                Click.on(Gender(form.getGender())),
                Enter.theValue(form.getMobile()).into(MOBILE),
                WaitUntil.the(DATE_BIRTH, isVisible()).forNoMoreThan(TEN_NUM).seconds(),
                Click.on(DATE_BIRTH),
                Click.on(DATE_BIRTH_YEAR),
                Click.on(DATE_BIRTH_YEAR_1),
                Click.on(DATE_BIRTH_MONTH),
                Click.on(DATE_BIRTH_MONTH_1),
                Click.on(DATE_BIRTH_DAY),
                Scroll.to(SUBJECTS),
                WaitUntil.the(SUBJECTS, isVisible()).forNoMoreThan(FIVE_NUM).seconds(),
                Click.on(SUBJECTS),
                WaitUntil.the(SUBJECTS, isVisible()).forNoMoreThan(TWO_NUM).seconds(),
                SendKeys.of(form.getSubjects()).into(SUBJECTS).thenHit(Keys.DOWN).thenHit(Keys.ENTER),
                Click.on(Hobbies(form.getHobbies()))
        );

        Path data = null;
        try {
            data = Paths.get(ClassLoader.getSystemResource("Toolsqa.jpg").toURI());
        } catch (URISyntaxException ignore) {
            Logger.getLogger("NO FOUND");
        }

        actor.attemptsTo(
                Upload.theFile(data).to(PICTURES),
                WaitUntil.the(SUBJECTS, isVisible()).forNoMoreThan(FIFTEEN_NUM).seconds(),
                Enter.theValue(form.getAddress()).into(ADDRESS),
                Click.on(STATE),
                Click.on(StateValue(form.getState())),
                Click.on(CITY),
                Click.on(CityValue(form.getCity())),
                Click.on(SUBMIT)
        );
    }

    public static EnterData with(Map<String, String> data) {
        return Tasks.instrumented(EnterData.class, data);
    }
}
