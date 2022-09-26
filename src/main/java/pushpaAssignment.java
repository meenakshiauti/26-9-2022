import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pushpaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Pushpa the rise"+Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Pushpa:_The_Rise']")).click();
		
	WebElement wb=	driver.findElement(By.xpath("//div[contains(text(),'Release date')]/following::div[@class='plainlist']/ul/li"));
	
	System.out.println(wb.getText());
		
		

	}

}
