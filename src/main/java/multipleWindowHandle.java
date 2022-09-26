import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class multipleWindowHandle {
	
	static Set<String> allWindow;
	static String hrmWindow;
	static String fbWindow;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		String parent=driver.getWindowHandle();
		System.out.println(driver.getTitle());

		
		driver.findElement(By.partialLinkText("HRM")).click();
		
	    allWindow= driver.getWindowHandles();
		
		for(String a:allWindow)
		{
			if(!(a.equals(parent)))
					{
				driver.switchTo().window(a);
				hrmWindow= driver.getWindowHandle();
				System.out.println(driver.getTitle());
					}
			
		}
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		allWindow=driver.getWindowHandles();
		
		for(String b:allWindow)
		{
			if(!(b.equals(parent)&& !(b.equals(hrmWindow))))
			{
				driver.switchTo().window(b);
				driver.getTitle();
				 fbWindow=driver.getWindowHandle();
				 System.out.println(driver.getTitle());

			}
		}
		
		driver.switchTo().window(parent);
		
		
		
		

	}

}
