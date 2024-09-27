package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI extends PageObject {

    public static final Target CARD_INTERACTIONS = Target.the("card-interactions")
            .located(By.xpath("//div[@class=\"card mt-4 top-card\"]//div[@class=\"card-body\"]//h5[contains(text(),'Interactions')]"));
}
