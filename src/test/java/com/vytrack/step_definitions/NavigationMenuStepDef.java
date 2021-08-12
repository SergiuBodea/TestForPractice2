package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDef {

    @When("the user should navigate to Fleet Vehicles")
    public void the_user_should_navigate_to_Fleet_Vehicles() {
        System.out.println("the user should navigate to Fleet Vehicles");
    }

    @Then("the user should be on Vehicles page")
    public void the_user_should_be_on_Vehicles_page() {
        System.out.println("Expected and Actual are matching");
    }

    @When("the user should navigate to Marketing Campaigns")
    public void the_user_should_navigate_to_Marketing_Campaigns() {
        System.out.println("the user should navigate to Marketing Campaigns");
    }

    @Then("the user should be on Campaigns page")
    public void the_user_should_be_on_Campaigns_page() {
        System.out.println("Expected and Actual are matching");
    }

    @When("the user should navigate to Activities Calendar Events")
    public void the_user_should_navigate_to_Activities_Calendar_Events() {
        System.out.println("the user should navigate to Activities Calendar Events");
    }

    @Then("the user should be on Calendar Events page")
    public void the_user_should_be_on_Calendar_Events_page() {
        System.out.println("Expected and Actual are matching");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        new DashboardPage().navigateToModule(tab,module);

    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum){
        BrowserUtils.waitFor(4);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualPage = Integer.parseInt( contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(expectedPageNum,actualPage);

    }

}
