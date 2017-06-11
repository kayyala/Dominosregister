import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Sudhakar on 11/06/2017.
 */
public class StepDef {
    Mainpage mainpage = new Mainpage();
    Registrationpage RG = new Registrationpage();
    checkingAC vf = new checkingAC();


    @Given("^I am navigative to dominos web page$")
    public void i_am_navigative_to_dominos_web_page() throws Throwable {
        mainpage.isonHome();
    }

    @Given("^i am click on register and enter fields$")
    public void i_am_click_on_register_and_enter_fields() throws Throwable {
        mainpage.MyAccount();

    }

    @When("^I contacting by email or SMS$")
    public void i_contacting_by_email_or_SMS() throws Throwable {
        RG.enteringfield();
    }

    @Then("^i conform the account and logout$")
    public void i_conform_the_account_and_logout() throws Throwable {
        vf.accountvf();
    }
}
