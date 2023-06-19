package week_11_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HeroKuapp {

    // 1. Set up the Chrome browser
    static String browser = "Firefox";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if ( browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        //  2. Open URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // timeout to view
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //3. Print the title of the page
        driver.getTitle();

        // 4. Print the current url
        driver.getCurrentUrl();

        // 5. Print the page source
        driver.getPageSource();

        //  6. Enter the email to email field
        driver.findElement(By.id("username")).sendKeys("Prime123.com");

        // 7. Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("123456");

        // Time to view in slow motion
        Thread.sleep(5000);

        //8. Close the browser
        driver.close();



    }
}
