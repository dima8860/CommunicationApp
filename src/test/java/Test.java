import io.cucumber.datatable.dependency.difflib.Delta;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Hello");
        WebElement logo = driver.findElement(By.cssSelector("#hplogo"));
        Actions action = new Actions(driver);
        action.click(logo).perform();

        Thread.sleep(3000);
        WebElement googleSearchButton = driver.findElement(By.xpath("//div[@jsname='VlcLAe']/center/input[@value='Google Search']"));
        action.click(googleSearchButton).perform();


    }
}
