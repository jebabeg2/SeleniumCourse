package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selfy1 {

	public static void main(String[] args) throws IOException 
	{
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
		
	 File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(scrnshot, new File("C:\\Users\\begyu\\Pictures\\Screenshots\\amazon.png"));
	}

}
