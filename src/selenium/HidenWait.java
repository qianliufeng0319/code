package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidenWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("http://www.baidu.com");
		
		WebElement element1 = ((ChromeDriver) dr).findElementByName("tj_trnews");
		
        System.out.println(dr);

				dr.quit();
	}

}
