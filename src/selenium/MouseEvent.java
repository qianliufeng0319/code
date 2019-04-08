package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("https://www.baidu.com");
		dr.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.findElement(By.name("tj_trnews")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		WebElement testitem = dr.findElement(By.xpath("//*[@id=\"pane-news\"]/div/ul/li[1]/strong/a"));
//		testitem.click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// 左击实现（和元素的click类似）
		Actions action = new Actions(dr);
		WebElement testlitem = dr.findElement(By.xpath("//*[@id=\"pane-news\"]/div/ul/li[1]/strong/a"));
		action.click(testlitem).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.quit();
		
	
		// 悬停 到更多按钮实现
		
		WebDriver dr2 = new ChromeDriver();
		dr2.get("https://www.baidu.com");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Actions(dr2).moveToElement(dr2.findElement(By.xpath("//*[@id=\"u1\"]/a[8]"))).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	      // 右击实现
		//dr2.findElement(By.xpath("//*[@id=\"wrapper\"]/div[6]/a[4]")).click();
		new Actions(dr2).contextClick(dr2.findElement(By.xpath("//*[@id=\"wrapper\"]/div[6]/a[4]"))).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
        // 拖动实现
		
		
//		53         driver.findElement(By.xpath("//*[@id='tbPic']")).click();
//		54         WebElement begin = driver.findElement(By.xpath("//*[@id='list']/li[1]/div[2]/span[1]"));
//		55         WebElement end = driver.findElement(By.xpath("//*[@id='list']/li[2]/div[2]/span[1]"));
//		56         new Actions(driver).dragAndDrop(begin, end).perform();
		 dr2.quit();


		
		
		
	}

}
