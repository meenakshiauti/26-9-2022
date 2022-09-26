import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement username=driver.findElement(By.id("txtUsername"));

		WebElement pwd=driver.findElement(By.id("txtPassword"));

		WebElement lgnBtn=driver.findElement(By.id("btnLogin"));

		boolean a=username.isDisplayed();

		System.out.println(a);

		boolean b=username.isEnabled();

		System.out.println(b);

		boolean c=pwd.isDisplayed();
		System.out.println(c);

		boolean d=pwd.isEnabled();
		System.out.println(d);
		
		username.sendKeys("Admin");

		pwd.sendKeys("admin123");

		boolean e=lgnBtn.isDisplayed();

		System.out.println(e);

		boolean f=lgnBtn.isEnabled();

		System.out .println(f);

		lgnBtn.click();

		String ActualTitle=driver.getTitle();
		
		System.out.println(ActualTitle);

		if(ActualTitle.contains("HRM"))
		{
		  System.out.println("Test is passed");
		}

		else
		{
		System.out.println("testcase is failed");
		}

		driver.close();






		
	}

}
