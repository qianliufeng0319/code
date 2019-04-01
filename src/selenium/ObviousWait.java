package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObviousWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
		//ÏÔÊ¾µÈ´ý
		WebElement element  = (new WebDriverWait(dr,5))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
		
	    dr.quit();
		
		
	}

}
