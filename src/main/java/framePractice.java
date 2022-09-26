import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
//		
//		
//		WebElement wb= driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
//		
//		Thread.sleep(4000);
//		driver.switchTo().frame(wb);
//		
//		WebElement wb1= driver.findElement(By.linkText("org.openqa.selenium"));
//		System.out.println(wb1.getText());
//		wb1.click();
//		
////		
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
//		
//           WebElement wb2= driver.findElement(By.xpath("//iframe[@name='classFrame']"));
//
//           Thread.sleep(4000);
//           driver.switchTo().frame(wb2);
//           Thread.sleep(4000);
//		driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
//		
//		
//		----------------------------------------------------------------------------------
		
		
		
//		driver.get("https://praf002.github.io/");
//		
//		driver.findElement(By.id("name")).sendKeys("Meenakshi");
//		
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.id("mob")).sendKeys("1234567890");
//		
//		driver.switchTo().frame(0);
//		
//		driver.findElement(By.id("Selenium")).click();
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(1);
//		
//		driver.findElement(By.id("add")).sendKeys("Pune");
//		
//		driver.switchTo().frame(0);
//		
//		WebElement wb= driver.findElement(By.id("course"));
//		
//		wb.click();
//		
//		Select sel=new Select(wb);
//		
//		sel.selectByVisibleText("Cucumber");
//		
//		Thread.sleep(5000);
//		
//		WebElement frm=driver.findElement(By.xpath("//iframe[@src='frame5.html']"));
//		
//		Thread.sleep(5000);
//		driver.switchTo().frame(frm);
//		
//		Thread.sleep(5000);
//		WebElement link= driver.findElement(By.linkText("Selenium"));
//		
//		System.out.println(link.getText());
//		
//		link.click();
		
//		
		
		//=================================================================================
		
//driver.get("https://praf002.github.io/");
//		
//		//- Enter the full name
//		driver.findElement(By.id("name")).sendKeys("Automation Testing");
//		
//		//- switch to address frame and enter the Pune Text
//		driver.switchTo().frame(1);
//		driver.findElement(By.id("add")).sendKeys("Pune MH");
//		Thread.sleep(5000);
//		//- switch to tool name frame and select the jenkins value from drop down
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='Frame4.html']")));
//		
//		WebElement wb =driver.findElement(By.id("course"));
//		
//		Select sel =new Select(wb);
//		sel.selectByValue("9");
//		
//		Thread.sleep(5000);
//		//- switch to selenium link frame and capture the link name
//		driver.switchTo().frame(0);
//		
//		String b =driver.findElement(By.xpath("//a[text()='Selenium']")).getText();
//		System.out.println(b);
//		
//		//It will switch to immediate parent frame
//		// switch to tool name frame and capture the selected value from drop down
//		Thread.sleep(5000);
//		driver.switchTo().parentFrame();
//		
//		WebElement abc =sel.getFirstSelectedOption();
//		String c =abc.getText();
//		System.out.println(c);
//		
//		
//		//- switch to mobile no frame and enter the text.
//		driver.switchTo().defaultContent();
//		Thread.sleep(5000);
//		
//		driver.switchTo().frame(0);
//		WebElement wb3 =driver.findElement(By.id("mob"));
//		wb3.sendKeys("432445677");
//		System.out.println(wb3.getAttribute("value"));
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement wb= driver.findElement(By.id("animals"));
		
		wb.click();
		
		Select sel=new Select(wb);
		
		sel.selectByVisibleText("Baby Cat");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
	}

}
