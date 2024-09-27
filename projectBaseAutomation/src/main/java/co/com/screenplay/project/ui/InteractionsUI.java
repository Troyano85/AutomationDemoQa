package co.com.screenplay.project.ui;

import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.assertj.core.presentation.StandardRepresentation;
import org.openqa.selenium.By;

public class InteractionsUI extends PageObject {

    public static final Target BTN_FORMS=Target.the("Selecciona  el boton formulario")
            .located(By.xpath("//div[@class=\"header-text\"][ contains(text(),'Forms')]"));

    public static final Target BTN_PRACTICE_FORM=Target.the("Selecciona el boton practica de formulario")
            .located(By.xpath("//span[@class=\"text\"][contains(text(),'Practice Form')]"));

    public static final Target TITLE_PAGE=Target.the("Selecciona el titulo de la pagina")
            .located(By.xpath("//h1[@class=\"text-center\"]"));
}
