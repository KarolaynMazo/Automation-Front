package co.com.test2.userinterface;

import co.com.test2.utils.Utils;
import net.serenitybdd.screenplay.targets.Target;

public class AutomationPractice {
    public static final Target SEARCH = Target.the("Search product")
            .locatedBy("//input[@id='search_query_top']");

    public static final Target ICON_SEARCH = Target.the("Search product")
            .locatedBy("//*[@id='searchbox']/button");


    public static String CONFIRMATION = "//span[contains(text(),'%s')]";

    public static Target Confirmation(String confirmation) {
        return Target.the("name the product")
                .locatedBy(Utils.replace(CONFIRMATION, confirmation));
    }
}
