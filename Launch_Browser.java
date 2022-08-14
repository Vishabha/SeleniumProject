package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Browser {
	
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir") + "\\chromedriver.exe";
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
			
			//System.setProperty("webdriver.chrome.driver","D:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
			
		//	WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.facebook.com/signup");
			
		WebElement fbday= driver.findElement(By.xpath("//*[@id='day']"));
		Select day = new Select(fbday);
		day.selectByValue("25");
		
		WebElement fbmonth= driver.findElement(By.xpath("//*[@id='month']"));
		Select month = new Select(fbmonth);
		month.selectByValue("6");
		
		WebElement fbyear= driver.findElement(By.xpath("//*[@id='year']"));
		Select year = new Select(fbyear);
		year.selectByValue("2016");
		
		
	
	}

}
