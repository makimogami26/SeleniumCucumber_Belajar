package stepDefinitionAlto;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AltoHRMstep {

    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\OS14\\Desktop\\chromedriver.exe");
         driver =  new ChromeDriver();
    }


    @When("I open Alto Hrm Homepage")
    public void i_open_Alto_Hrm_Homepage() {
        driver.get("http://dimasportofolio.herokuapp.com/");

    }


    @Then("I verify that the logo present on page")
    public void i_vefiry_that_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("/html/body/app-root/app-profile/div/app-intro/div/div/div/div[2]/div/div[1]/a/img")).isDisplayed();
        Assert.assertEquals(true , status);

    }


    @And("close Browser")
    public void close_Browser() {
    driver.quit();
    }
}
