package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.baidu.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dr.findElements(By.name("tj_login")).get(1).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dr.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
		dr.findElement(By.id("TANGRAM__PSP_10__userName")).clear();
		dr.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys("quanlinger111");
		dr.findElement(By.id("TANGRAM__PSP_10__password")).clear();
		dr.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys("Leoncao147123");
		dr.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		
		
  	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.quit();
	}
}
