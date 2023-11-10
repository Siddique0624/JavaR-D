package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {

	@Given("^I am a manual tester$")
	public void IamManualTester() {
		System.out.println("I am a manual tester");
	}
	@When("^I apply for new job$")
	public void Iapplyfornewjob() {
		System.out.println("I apply for new job");
	}
	@Then("^I get less pay$")
	public void Igetlesspay() {
		System.out.println("I get less pay");
	}
	@And("^I am not satistfied with my salary$")
	public void Iamnotsatistfiedwithmysalary() {
		System.out.println("I am not satistfied with my salary");
	}
	
	@But("^My parents are satisfied$")
	public void  Myparentsaresatisfied() {
		System.out.println("My parents are satisfied");
	}

	
}
