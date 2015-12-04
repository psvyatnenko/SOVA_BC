package SOVA_BCTest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class MySteps {

    String login = "lms";
    String password = "lms";
    String empty = "";

    @Given("On LMS authorization page")
    public void givenOnLMSauthorizationPage() {
        open("http://10.0.1.174:9000/");
    }

    @When("Input valid login")
        public void whenInputValidLogin() {
        $(byAttribute("placeholder","Логин")).shouldBe(visible).setValue(login);
    }

    @When("Input valid password")
        public void whenInputValidPassword() {
        $(byAttribute("placeholder","Пароль")).shouldBe(visible).setValue(password);
    }

    @When("Press enterButton")
    public void whenPressEnterButton() {
        $(byAttribute("value","ВОЙТИ")).shouldBe(visible).click();
    }
    @Then("Open objectPage")
        public void thenOpenObjectPage() {
        $(byText("БИЗНЕС-ЦЕНТР")).shouldBe(visible);
        $(byText("Object map")).shouldBe(visible);
        $(byText("Поиск")).shouldBe(visible);
        $(byText("Route")).shouldBe(visible);
        $(byText("Пользователи")).shouldBe(visible);
//        $(byText("admin")).shouldBe(visible);
    }

}
