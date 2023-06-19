package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class NopCommerce1 {
    // 1. Setup Chrome browser
    static String browser = "Chrome";
    static String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2";
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

        // Time to view
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("Page of the Title is  " + driver.getTitle());
        // 4. Print the current url
        System.out.println("The current driver url is  " + driver.getCurrentUrl());
        //  5. Print the page source
        System.out.println("The page source is " + driver.getPageSource());
        // 6. Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");
        // 7. Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("123456");
        // Time to watch the replay
        Thread.sleep(5000);
        // 8. Close the browser
         driver.close();

    }
}
