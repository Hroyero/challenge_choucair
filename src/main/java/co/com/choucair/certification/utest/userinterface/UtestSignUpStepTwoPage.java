package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpStepTwoPage {
    public static final Target INPUT_FIRST_NAME = Target.the("Where we write the first name").located(By.cssSelector("#city"));
    public static final Target INPUT_LAST_NAME = Target.the("Where we write the last name").located(By.cssSelector("#zip"));
    public static final Target INPUT_COUNTRY = Target.the("Where we write the last name").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]"));
    public static final Target BUTTON_NEXT_DEVICES  = Target.the("Where we write the city").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
