package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");
		dr.manage().window().maximize();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 切换到某一个frame内部
		dr.switchTo().frame("rightMain");
		
		dr.findElement(By.name("taglist_menu")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        // 切换到Top Windows，点击权限提示上面的去登录按钮。
		
		dr.switchTo().defaultContent();
		
		dr.findElement(By.xpath("//*[@id=\'noLoginAlert\']/div/button")).click();
		
		

		
		
		
		
		
	}
	
	

}
