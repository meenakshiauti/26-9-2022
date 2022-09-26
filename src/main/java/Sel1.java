import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String a =driver.getTitle();
		
		System.out.println(a);
		
		driver.navigate().to("https://www.google.com/");
		
		String b=driver.getCurrentUrl();
		System.out.println(b);
		
		driver.navigate().back();
		
		String c=driver.getCurrentUrl();
		System.out.println(c);
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		String d=driver.getCurrentUrl();
		System.out.println(d);
		
		
		String e= driver.getPageSource();
		
		System.out.println(e);
		
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
