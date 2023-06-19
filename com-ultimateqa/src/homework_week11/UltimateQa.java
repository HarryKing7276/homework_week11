package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class UltimateQa {

    // 1. 1. Setup Chrome browser
    static String browser = "Firefox";
    static String baseurl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();  
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        // 2. Open URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // Timeout to view
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("The title of the page is "  +driver.getTitle());

        // 4. Print the current url
        System.out.println("The Current URL is "+driver.getCurrentUrl());

        //  5. Print the page source
        System.out.println("The page source is "+driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Prime123@gmail.com");

        // 7. Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("123456");

        // To view in slow motion
        Thread.sleep(5000);

        // Close the URL
        driver.close();







    }

}
