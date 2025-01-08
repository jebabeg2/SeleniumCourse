package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to the redBus website
            driver.get("https://www.redbus.in/");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Wait for the page to load (add appropriate wait conditions as needed)
            Thread.sleep(5000); // Use WebDriverWait for better handling

            // Locate and click on the date input field to open the calendar
            WebElement dateInput = driver.findElement(By.id("onward_cal"));
            dateInput.click();

            // Wait for the calendar to appear
            Thread.sleep(2000); // Use WebDriverWait for better handling

            // Use JavaScriptExecutor to navigate to April 25th
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.querySelectorAll('.rb-monthTable.first.last td')[24].click();");

            // Add further steps if needed (e.g., selecting bus, filling details, etc.)

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}