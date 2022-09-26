import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("abc");
		
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		
		driver.findElement(By.name("reg_email__")).sendKeys("1234567845");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("sdwe45@&!4378");
		
		WebElement wb=driver.findElement(By.id("day"));
		Select sel45=new Select(wb);
		sel45.selectByIndex(8);
		
		WebElement wb1=driver.findElement(By.id("month"));
		Select sel1=new Select(wb1);
		sel1.selectByValue("11");
		
		WebElement wb2=driver.findElement(By.id("year"));
		Select sel2=new Select(wb2);
		sel2.selectByVisibleText("1993");
		
		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
		
		
		
		

	}

}
