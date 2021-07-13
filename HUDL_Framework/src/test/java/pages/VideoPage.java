package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtilities;
import utilities.Driver;

public class VideoPage {


    protected WebDriver driver = Driver.getDriver("chrome");
    protected WebDriverWait wait = new WebDriverWait(driver, 25);
    Actions actions = new Actions(driver);

    public void clickVideoButton(){

        driver.findElement(By.xpath("//span[contains(text(),'Video')]")).click();

    }

    public void clickFirstVideo(){
        BrowserUtilities.wait(2);
        driver.findElement(By.id("App")).click();
        BrowserUtilities.wait(10);
    }

    public void replayVideo(){
        driver.findElement(By.xpath("//body/section[@id='App']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")).click();
        BrowserUtilities.wait(10);
    }

    public void addCommentAndDelete(){
        driver.findElement(By.xpath("//body/section[@id='App']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/ol[1]/div[1]/section[3]/div[1]/li[1]/div[1]/div[2]/div[2]/section[1]/div[1]/section[1]/div[1]")).click();
        driver.findElement(By.xpath("//body/section[@id='App']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/ol[1]/div[1]/section[3]/div[1]/li[1]/div[1]/div[2]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).sendKeys("Bae comment");
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
        BrowserUtilities.wait(3);
        driver.findElement(By.className("comment__delete-icon--hidden--3NgjuZnp")).click();
        BrowserUtilities.wait(2);
    }
    public void closeBrowser(){
        driver.quit();
    }


}
