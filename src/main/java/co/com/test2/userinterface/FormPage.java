package co.com.test2.userinterface;

import co.com.test2.utils.Utils;
import net.serenitybdd.screenplay.targets.Target;

public class FormPage {

    public static final Target NAME = Target.the("Enter the name")
            .locatedBy("//input[@id='firstName']");

    public static final Target LAST_NAME = Target.the("Enter the lastName")
            .locatedBy("//input[@id='lastName']");

    public static final Target EMAIL = Target.the("Enter the userEmail")
            .locatedBy("//input[@id='userEmail']");

    public static final String GENDER = "//label[contains(text(),'%s')]";

    public static Target Gender(String gender) {
        return Target.the("Enter the gender user")
                .locatedBy(Utils.replace(GENDER, gender));
    }

    public static final Target MOBILE = Target.the("Enter the userMobile")
            .locatedBy("//input[@id='userNumber']");

    public static final Target DATE_BIRTH = Target.the("Enter the userDateBirth")
            .locatedBy("//input[@id='dateOfBirthInput']");

    public static final Target DATE_BIRTH_YEAR = Target.the("Enter the userDateBirth")
            .locatedBy("//select[@class='react-datepicker__year-select']");

    public static final Target DATE_BIRTH_YEAR_1 = Target.the("Enter the userDateBirth")
            .locatedBy("//option[@value='2021']");

    public static final Target DATE_BIRTH_MONTH = Target.the("Enter the userDateBirth")
            .locatedBy("//select[@class='react-datepicker__month-select']");

    public static final Target DATE_BIRTH_MONTH_1 = Target.the("Enter the userDateBirth")
            .locatedBy("//option[@value='11']");

    public static final Target DATE_BIRTH_DAY = Target.the("Enter the userDateBirth")
            .locatedBy("//div[@aria-label='Choose Sunday, November 28th, 2021']");


    public static final Target SUBJECTS = Target.the("Enter the userSubject")
            .locatedBy("//*[@id='subjectsInput']");

    public static final String HOBBIES = "//label[contains(text(),'%s')]";

    public static Target Hobbies(String hobbies) {
        return Target.the("Enter the hobbies user")
                .locatedBy(Utils.replace(HOBBIES, hobbies));
    }

    public static final Target PICTURES = Target.the("Enter the userPictures")
            .locatedBy("//input[@id='uploadPicture']");

    public static final Target ADDRESS = Target.the("Enter the userAddress")
            .locatedBy("//textarea[@id='currentAddress']");


    public static final Target STATE = Target.the("Enter the userState")
            .locatedBy("//*[@id='state']");

    public static final String STATE_VALUE = "//div[contains(text(),'%s')]";

    public static Target StateValue(String value) {
        return Target.the("Enter the value")
                .locatedBy(Utils.replace(STATE_VALUE, value));
    }

    public static final Target CITY = Target.the("")
            .locatedBy("//*[@id='city']/div/div[1]");

    public static String CITY_VALUE = "//div[contains(text(),'%s')]";

    public static Target CityValue(String value) {
        return Target.the("Enter the value")
                .locatedBy(Utils.replace(CITY_VALUE, value));
    }

    public static final Target SUBMIT = Target.the("Button de submit")
            .locatedBy("//button[@id='submit']");

    public static String MESSAGE_CONFIRMATION = "//div[contains(text(),'%s')]";

    public static final Target Message(String message){
        return Target.the("Message confirmation")
                .locatedBy(Utils.replace(MESSAGE_CONFIRMATION,message));
    }




}
