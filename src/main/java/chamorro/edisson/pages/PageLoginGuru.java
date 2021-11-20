package chamorro.edisson.pages;

import java.util.Map;

import org.openqa.selenium.By;

import chamorro.edisson.actions.Action;
import chamorro.edisson.utils.Constant;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;

public class PageLoginGuru extends PageObject {

	By fieldUser = By.name("uid");
	By fieldPass = By.name("password");

	public void navegateTo(String url) {

		Action.navegateToUrl(getDriver(), url);
	}

	public void logear(DataTable dataUser) {
		Map<String,String> data= dataUser.asMap(String.class,String.class);
		
		Action.sendData(getDriver(), fieldUser, data.get("user"));
		Action.sendData(getDriver(), fieldPass, data.get("password"));
		Action.clickElement(getDriver(),
				By.xpath(String.format(Constant.GENERIC_INPUT_VALUE, data.get("button name"))));
	}

}
