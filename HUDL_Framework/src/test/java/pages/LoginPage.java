package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage  {


    protected WebDriver driver = Driver.getDriver("chrome");
    protected WebDriverWait wait = new WebDriverWait(driver, 25);
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//header/div[2]/ul[1]/li[3]/a[1]")
    WebElement loginButton;


    public void navigateToLoginPage(){
        System.out.println("Open login page");
        String env = "env";
        if (System.getProperty("env") != null) {
            env = System.getProperty("env");
        }
        String URL = ConfigurationReader.getProperty(env);
        System.out.println("URL :: " + URL);
        Driver.getDriver().get(URL);
        driver.manage().window().maximize();

    }

    public void enterLoginDetails(String email, String password) {

        driver.findElement(By.xpath("//header/div[2]/ul[1]/li[3]/a[1]")).click();
        //driver.findElement(By.)
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='logIn']")).click();
        BrowserUtilities.wait(3);



    }

    public void assertHomePage(){
        String expectedUserName = driver.findElement(By.xpath("//a[contains(text(),'burhan a')]")).getText();
        String actualUserName = "burhan a";
        Assert.assertEquals(expectedUserName,actualUserName);
    }

    public void closeBrowser(){
        driver.quit();
    }

}
