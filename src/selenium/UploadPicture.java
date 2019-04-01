package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadPicture {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("http://www.baidu.com");
		
		WebElement element  = (new WebDriverWait(dr,5))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form']/span[1]/span")));
		
		
		dr.findElement(By.xpath("//*[@id=\'form\']/span[1]/span")).click();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File("D:/123.jpg");
		
		dr.findElement(By.className("upload-pic")).sendKeys(file.getPath());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.quit();
	}

}
