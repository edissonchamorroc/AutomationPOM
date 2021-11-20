package chamorro.edisson.pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import chamorro.edisson.actions.Action;
import chamorro.edisson.utils.Constant;
import net.serenitybdd.core.pages.PageObject;

public class PageManagerGuru extends PageObject {

	public void verifyLogin(String message) {
		assertEquals(message,
				Action.getElementText(getDriver(), By.xpath(String.format(Constant.GENERIC_FORMAT_TEXT, message))));
	}
}
