package chamorro.edisson.stepdefinitions;

import chamorro.edisson.pages.PageLoginGuru;
import chamorro.edisson.pages.PageManagerGuru;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruLoginStepDefinitions {

	PageLoginGuru pageIndex;
	PageManagerGuru pageRegiste;

	@Given("Dado que estoy en la url:{string}")
	public void dadoQueEstoyEnLaUrl(String url) {
		pageIndex.navegateTo(url);
	}

	@When("Ingreso datos de usuario")
	public void ingresoDatosDeUsuario(DataTable userData) {
		pageIndex.logear(userData);
	}

	@Then("Verifico el mensaje {string}")
	public void verificoElMensaje(String message) {
		pageRegiste.verifyLogin(message);
	}

}
