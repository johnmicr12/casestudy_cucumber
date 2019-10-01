package StepDef;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definestep1 {
WebDriver driver;
@Given("App is up")
public void app_is_up() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("register")
public void register() {
	
   
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("enter username and password")
public void enter_username_and_password() {
	/*driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demo");

	driver.findElement(By.xpath("//input[@name='register']")).click();*/
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("Jhon purchse a microwave for {int} doll")
public void jhon_purchse_a_microwave_for_doll(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("he has a recepit")
public void he_has_a_recepit() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("Jhon returened the faulty product")
public void jhon_returened_the_faulty_product() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("he got refund of {int} doll")
public void he_got_refund_of_doll(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("he got refund of {int}")
public void he_got_refund_of(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}
@Given("credentials are")
public void credentials_are(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver", "C:\\DriverFolders\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
   java.util.List<WebElement> lnk_coll=driver.findElements(By.tagName("a"));
   int lnk_cnt=lnk_coll.size();
   System.out.println(lnk_cnt);
   for(int i=0;i<=lnk_coll.size()-1;i++)
   {
	   String lnk_name=lnk_coll.get(i).getText();
	   System.out.println(lnk_name);
   }
   List<List<String>> data=dataTable.cells();
   System.out.println(data.get(0));
   System.out.println(data.get(0));
   
	
}


}
