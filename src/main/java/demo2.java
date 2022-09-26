import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/checkbox.html");
		
		List<WebElement> ls=driver.findElements(By.tagName("input"));
		
		System.out.println(ls.size());
		
		for(WebElement abc:ls)
		{
				System.out.println(abc.isDisplayed());
				System.out.println(abc.isEnabled());
				System.out.println(abc.isSelected());
				abc.click();
				Thread.sleep(5000);
				System.out.println(abc.isSelected());
				System.out.println("------------------------------------------");
		}
		
		
		

	}

}
