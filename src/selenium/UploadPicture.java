package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPicture {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("http://www.baidu.com");
		WebElement element1 = ((ChromeDriver) dr)
				.findElementByXPath("WebElement element1 = ((ChromeDriver) dr).findElementByName(\"tj_trnews\")");
		
		dr.findElement(By.xpath("//*[@id=\'form\']/span[1]/span")).click();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.findElement(By.className("soutu-drop")).sendKeys("D:\\Backup\\×ÀÃæ");
	}

}
