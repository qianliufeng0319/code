package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("https://www.jd.com");
		dr.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.findElement(By.xpath("//*[@id=\'J_cate\']/ul/li[2]/a[1]")).click();
		
		 // 获取当前页面句柄  
	      String handle = dr.getWindowHandle();
	    // 获取所有页面的句柄，并循环判断不是当前的句柄 
	      for(String handles : dr.getWindowHandles()) {
	    	  
	    	  if(handles.equals(handle))
	    		  
	    	  continue;
	    	  
	    	  dr.switchTo().window(handles);
	      }
	      
	      try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 dr.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div/dl[1]/dd/ul/li[3]/a"));
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

}
