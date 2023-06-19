package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SauceDemo {

static String browser = "Chrome";
static String baseurl = "https://www.saucedemo.com/";
static WebDriver driver;

     // 1. Set Chrome browser

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("Chrome")){
       driver = new ChromeDriver();
       } else if (browser.equalsIgnoreCase("Firefox")){
        driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browses name");
        }

        // 2. Open URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // Timeout to view
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("The title of page is  "+driver.getTitle());

        // 4. Print the current url
        System.out.println("The current URL is " +driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("The page source is " +driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("Prime123@gmail.com");

        // 7. Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("123456");

        // Watch the test in slow motion
        Thread.sleep(5000);

        // 8. Close the browser
        driver.close();


    }

    }
