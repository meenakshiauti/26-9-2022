import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//Alert alt=driver.switchTo().alert();
		
//		Thread.sleep(3000);
//		System.out.println(alt.getText());
//		alt.accept();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		//Thread.sleep(3000);
		alt.sendKeys("Meenakshi Auti");
		Thread.sleep(5000);
		alt.accept();
		
		driver.close();
	}

}
