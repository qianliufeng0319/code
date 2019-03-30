package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.baidu.com");
		
		dr.findElement(By.id("kw")).clear();
		dr.findElement(By.id("kw")).sendKeys("°×³Õ");
		dr.findElement(By.id("su")).click();
		
		
  	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.quit();
	}
}
