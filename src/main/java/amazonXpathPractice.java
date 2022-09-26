import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonXpathPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

//		driver.get("https://www.goibibo.com/");
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//div[@class='sc-himrzO bZxKPD']//div[contains(@class,'sc-bjUoiL ldeDAM fswFld')]//p[@class='sc-iIPllB ezZWci fswWidgetPlaceholder'][contains(text(),'Enter city or airport')]")).click();
//		driver.findElement(By.xpath("//div[@class='sc-himrzO bZxKPD']//div[contains(@class,'sc-bjUoiL ldeDAM fswFld')]//p[@class='sc-iIPllB ezZWci fswWidgetPlaceholder'][contains(text(),'Enter city or airport')]")).sendKeys("Pune");
//		driver.findElement(By.xpath("//span[@class='sc-gKXOVf FvhGa']")).click();
//		
//	    int a=1;
//		while(a<3)
//		{
//			driver.findElement(By.xpath("//div[@class='sc-dwLEzm kllMYM']/following::span[3]")).click();
//			a++;
//		}
//		
//		
//		
//		int b=1;
//		while(b<5)
//		{
//			driver.findElement(By.xpath("//div[@class='sc-dwLEzm kllMYM']/following::span[6]")).click();
//			b++;
//		}
//		
//		
//		int c=1;
//		while(c<2)
//		{
//			driver.findElement(By.xpath("//div[@class='sc-dwLEzm kllMYM']/following::span[9]")).click();
//			c++;
//		}
//		
//		driver.findElement(By.xpath("//li[@class='sc-hiMGwR hHyNfl']")).click();
//		driver.findElement(By.xpath("//a[@class='sc-dsQDmV iCfezh']")).click();
		
		
		
		
		//redbus.in
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("pune");
		
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='sub-city']"));
		
		for(WebElement list:options)
		{
			if(list.getText().equalsIgnoreCase("pune"))
			{
				list.click();
				
				break;
			}
		}
		
		
		
//		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune"+Keys.ENTER);
//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai"+Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'>')]")).click();
		
		driver.findElement(By.xpath("//td[contains(text(),'17')]")).click();
		
		driver.findElement(By.xpath("//input[@id='onward_cal']/following::button[1]")).click();
		
		
	
		
		
		
	//redbus.com	
		
//	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune"+Keys.ENTER);
//		
//		
//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai"+Keys.ENTER);
//		
//		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
//		
//		 driver.findElement(By.xpath("//*[@id='Layer_1']")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();
//		
//		driver.findElement(By.xpath("//div[contains(text(),'SEARCH')]")).click();
		
		
	}

}
