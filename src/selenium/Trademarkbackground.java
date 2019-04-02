package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trademarkbackground {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		
		dr.get("https://admin-rs.86sb.net/users/signin");
		
		dr.manage().window().maximize();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.findElement(By.id("username")).clear();
		dr.findElement(By.id("username")).sendKeys("admin");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.findElement(By.id("password")).clear();
		dr.findElement(By.id("password")).sendKeys("123456");
		dr.findElement(By.xpath("/html/body/div/form/div/div/div[3]/button")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        dr.findElement(By.xpath("//*[@id=\'ext-element-1\']/div[1]/div[2]/div/div[1]/div/ul/li[3]/a")).click();
        
        
        
        
        
        dr.quit();
		
	}

}
