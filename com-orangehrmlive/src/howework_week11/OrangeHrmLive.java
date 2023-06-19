package howework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class OrangeHrmLive {

    // 1. Setup Chrome browser

    static String browser = "Chrome";
    static String baseurl = " https://opensource-demo.orangehrmlive.com/ ";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        // 2. Open URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // Timeout to view
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("This is the title of the page :  " + driver.getTitle());

        // 4. Print the current URL
        System.out.println("The current URL is   " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("The page source is " + driver.getPageSource());

        //6. Enter the email to email field
        driver.findElement(By.name("username")).sendKeys("Prime123.com");

        // 7. Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("123456");


        //8. Close the browser
           driver.close();
    }

}
