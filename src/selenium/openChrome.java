package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/leon/selenium/chromedriver");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.baidu.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.quit();
	}
}
