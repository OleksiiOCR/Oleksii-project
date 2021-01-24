import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HomeworkOrbitz {

    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/oleksiinikitenko/Desktop/Selenium/chromedriver");
        // System.setProperty("webdriver.gecko.driver", "/Users/oleksiinikitenko/Desktop/Selenium/geckodriver");
        //  WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orbitz.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //---Vagas
        driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-no-placeholder']")).click();
        driver.findElement(By.id("location-field-destination")).sendKeys("Las Vegas Nevada");
        driver.findElement(By.xpath("//div[@class='truncate']")).click();
        //---Dates

        driver.findElement(By.id("d1-btn")).click();

        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging']")).click();
        // Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-day='25']")).click();
        // Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging'][2]")).click();
        //  Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-day='8']")).click();
        driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']")).click();
        //-- Rooms
        driver.findElement(By.xpath("//button[@class='uitk-fake-input uitk-form-field-trigger']")).click();
        java.util.List<WebElement> ch = driver.findElements(By.xpath("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button']"));
        ch.get(3).click();
        ch.get(3).click();
        Select select = new Select(driver.findElement(By.id("child-age-input-0-0")));
        select.selectByIndex(2);

        Select select2 = new Select(driver.findElement(By.id("child-age-input-0-1")));
        select2.selectByIndex(4);
        //---Adding room

        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-small uitk-button-has-text uitk-button-tertiary']")).click();
        List<WebElement> adults = driver.findElements(By.xpath("//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button']"));
        adults.get(5).click();
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']")).click();
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']")).click();




    }

