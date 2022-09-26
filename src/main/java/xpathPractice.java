import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
//		List<WebElement> allMenus=driver.findElements(By.xpath("//div[@class='secondary-links hide-xs']//a[contains(@event-name,'desktop_top_menu')]"));
//		
//		for(int i=0;i<allMenus.size();i++)
//		{
//			
//			System.out.println(allMenus.get(i).getText());
//			
//			String s=allMenus.get(i).getText();
//			
//			if(s.contains("Book Now"))
//			{
//				System.out.println("Book Now ispresent");
//				driver.findElement(By.xpath("//a[@class='login-link event-elem']")).click();
//			}
//		}
		
//		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
//		
//		driver.findElement(By.xpath("//span[contains(text(),'boAt Airdopes 141 Bluetooth Truly Wirele…')]")).click();
//		
//		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//span[@id='attachSiNoCoverage-announce']")).click();
//		
//		String actualText=driver.findElement(By.xpath("//span[contains(text(),'Added to Cart')]")).getText();
//		
//		Assert.assertEquals(actualText, "Added to Cart");
		
		
		
		//div[@class='right-block']//a[contains(text(),'Blouse')]
		
		driver.manage().window().maximize();
		
		//a[@class='sf-with-ul']
		
		driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
		
		List<WebElement> all=driver.findElements(By.xpath("//div[@class='right-block']"));
		
		for(int i=0;i<all.size();i++)
		{
			String s1=all.get(i).getText();
			
			System.out.println(s1);
			
			if(all.get(i).getText().contains("Blouse"))
			{
				WebElement wb=driver.findElement(By.xpath("//a[@class='product_img_link' and @title='Printed Dress']"));
				Actions act=new Actions(driver);
				act.moveToElement(wb).build().perform();
				
			driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
			}
			
		}
		
		Thread.sleep(5000);
		
		String s=driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2")).getText();
		
		if(s.contains("successfully"))
		{
			System.out.println("product added success");
		}
	}

}
