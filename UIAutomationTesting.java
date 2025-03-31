import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Open OrangeHRM login page
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            
            // Wait for page to load
            Thread.sleep(2000);
            
            // Locate username and password fields and login button
            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]");
            
            // Enter credentials and click login
            username.sendKeys("Admin");
            password.sendKeys("admin123");
            loginButton.click();
            
            // Wait for dashboard to load
            Thread.sleep(3000);
            
            // Validate login success by checking dashboard element
            WebElement dashboard = driver.findElement(By.xpath("//h6[contains(text(),'Dashboard')]");
            if (dashboard.isDisplayed()) {
                System.out.println("Test Passed: Successfully logged in");
            } else {
                System.out.println("Test Failed: Login unsuccessful");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
