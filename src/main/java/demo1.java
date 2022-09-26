import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/checkbox.html");
		
		WebElement a=driver.findElement(By.name("API Testing"));
		
		boolean b=a.isDisplayed();
		System.out.println(b);
		
		boolean c=a.isEnabled();
		System.out.println(c);
		
		boolean d=a.isSelected();
		System.out.println(d);
		
		a.click();

		boolean e=a.isSelected();
		System.out.println(e);
	}

}
