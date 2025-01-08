package launcher;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();//setup chromedriver automatically and ensuring current chrome browser installed automatically.
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		int pagesize = driver.findElements(By.cssSelector("div[class='dt-paging'] button")).size();
	    System.out.println("pagesize:  "+pagesize);
	    
	    for(int i =3;i<pagesize-1;i++) 
	    {
	    	String pagelocator = "div[class='dt-paging'] button:first-child("+i+")";
	    	driver.findElement(By.cssSelector(pagelocator)).click();
	    	List<WebElement> names = driver.findElements(By.cssSelector("table#example >tbody>tr>td:first-child"));
	    
	    	
	    	//for(WebElement name:names)
	    	//{
	    	//	System.out.println(name.getText());
	    	//}
	    	//System.out.println("End of page: -------------- "+(i-2));
	    	
	    	for (int j = 0; j < names.size(); j++) {
	    	    WebElement name = names.get(j);  // Access the element by index
	    	    System.out.println(name.getText());
	    	}
	    	
	    	System.out.println("--------------------"+(i-1));

	    	
	    	
	    	Thread.sleep(3000);
	    }
	}

}
