package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefineStep {
public static WebDriver driver;
/*@Given("Sign Up")
public void sign_Up() {
	  driver=Drivers.getdriver("chrome");
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter Username as {string}")
public void enter_Username_as(String string) {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
	 driver.findElement(By.id("userName")).sendKeys(string);
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter Firstname as {string}")
public void enter_Firstname_as(String string) {
	driver.findElement(By.id("firstName")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter LastName as {string}")
public void enter_LastName_as(String string) {
	driver.findElement(By.id("lastName")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter Password as {string}")
public void enter_Password_as(String string) {
	driver.findElement(By.id("password")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Confirm your password {string}")
public void confirm_your_password(String string) {
	driver.findElement(By.id("pass_confirmation")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("Select Gender as {string}")
public void select_Gender_as(String string) {
	driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter Email as {string}")
public void enter_Email_as(String string) {
	driver.findElement(By.id("emailAddress")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("Enter Mobile Number as {string}")
public void enter_Mobile_Number_as(String string) {
	driver.findElement(By.id("mobileNumber")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter DOB as {string}")
public void enter_DOB_as(String string) {
	driver.findElement(By.name("dob")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Enter Address {string}")
public void enter_Address(String string) {
	driver.findElement(By.name("address")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Select Security question")
public void select_Security_question() {
	Actions act=new Actions(driver);
	 WebElement sq=driver.findElement(By.id("securityQuestion"));
	 act.moveToElement(sq).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Answer the question as {string}")
public void answer_the_question_as(String string) {
	 driver.findElement(By.name("answer")).sendKeys(string);
    // Write code here that turns the phrase above into concrete actions
  //throw new cucumber.api.PendingException();
}

@Given("CLick on Register")
public void click_on_Register() {
	 driver.findElement(By.xpath("//input[@name='Submit']")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Alex has registered into TestMeApp")
public void alex_has_registered_into_TestMeApp() {
	//System.out.println(string+string2);

	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("Alex login with below set of {string} and {string}")
public void alex_login_with_below_set_of_and(String string, String string2) throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.name("userName")).sendKeys(string);
	driver.findElement(By.name("password")).sendKeys(string2);
	driver.findElement(By.xpath("//input[@name='Login']")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("Alex login successfully into TestMeApp")
public void alex_login_successfully_into_TestMeApp() {
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
    driver.close();    
}*/

@Given("Alex has logged in into TestMeApp")
public void alex_has_logged_in_into_TestMeApp() {
	driver=Drivers.getdriver("chrome");
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password123");
	driver.findElement(By.xpath("//input[@name='Login']")).click();

    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("Alex search for a particular product like headphones")
public void alex_search_for_a_particular_product_like_headphones() {
		 Actions act =new Actions(driver);
		  WebElement search=driver.findElement(By.xpath("//input[@id='myInput']"));
		 
		  act.keyDown(search, Keys.SHIFT).sendKeys("H").pause(3000).sendKeys("e").pause(3000).sendKeys("a").pause(3000).keyUp(Keys.SHIFT).perform();
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().perform();
		  driver.findElement(By.xpath("//form//input[@name='val']")).click();
		  try {
              driver.findElement(By.partialLinkText("Cart"));
       }
   catch(Exception e)
   {
    System.out.println("There shall be atleast 1 item in cart");
   }
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("TestMeApp doesn't display the cart icon")
public void testmeapp_doesn_t_display_the_cart_icon() {
	
	/*WebElement bagno=driver.findElement(By.tagName("a"));
	String msg=bagno.getText();
	org.junit.Assert.assertEquals("1", msg);*/
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}



}
