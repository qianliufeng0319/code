package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEvents {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
		dr.manage().window().maximize();
		
		dr.findElement(By.id("kw")).sendKeys("selenium");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//删除一个m
		dr.findElement(By.id("kw")).sendKeys(Keys.BACK_SPACE);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //输入m 空格 教程
		
		dr.findElement(By.id("kw")).sendKeys("m");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.findElement(By.id("kw")).sendKeys(Keys.SPACE);
		dr.findElement(By.id("kw")).sendKeys("教程");
		
		//全选输入框内容
		
		dr.findElement(By.id("kw")).sendKeys(Keys.CONTROL,"a");
		
		//剪切输入框内容
		
		dr.findElement(By.id("kw")).sendKeys(Keys.CONTROL,"x");
		
		//粘贴输入框内容
		
		dr.findElement(By.id("kw")).sendKeys(Keys.CONTROL,"v");
		
		//通过回车来代替提交动作
		
		dr.findElement(By.id("kw")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		dr.quit();
	}

}
