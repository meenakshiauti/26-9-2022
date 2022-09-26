import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowHandleByArrayList {
	
	public static WebDriver driver;
	
	public static void selectFromDropdown(WebElement wb, String value)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	public static void takeScreenshot(String file) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\newScreenshot\\"+file+".png");
		FileUtils.copyFile(source, dest);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		driver.findElement(By.name("fname")).sendKeys("Meenakshi");
		
		driver.findElement(By.partialLinkText("Orange")).click();
		
//		Set<String> allWindow= driver.getWindowHandles();
//		
//		ArrayList<String> arr=new ArrayList<String>(allWindow);
//		
//		driver.switchTo().window(arr.get(1));
//		
//		driver.findElement(By.name("txtUsername")).sendKeys("admin");
//		
//		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//		
//		driver.findElement(By.id("btnLogin")).click();
//		
//		driver.switchTo().window(arr.get(0));
//		
//		driver.findElement(By.name("lname")).sendKeys("Auti");
		
		//enter fname
		//click on hrm
		//login to hrm
		//switch to parent
		//go to fb
		//get title
		//enter in dropdown
		//take screenshot
		//switch to orangeHRM
		//click on pim
		//take screenshot
		//switch to parent
		//enter lastname
		//take screenshot
		///switch to orange
		//enter in register mail
		
		
		Set<String> allwindow=driver.getWindowHandles();
		
		ArrayList<String> arr=new ArrayList<String>(allwindow);
		
		driver.switchTo().window(arr.get(1));
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.switchTo().window(arr.get(0));
		
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		allwindow=driver.getWindowHandles();
		
		arr=new ArrayList<String> (allwindow);
		
		driver.switchTo().window(arr.get(2));
		
		//System.out.println(driver.getTitle());
		
		WebElement date= driver.findElement(By.id("day"));
		multipleWindowHandleByArrayList.selectFromDropdown(date, "9");
		
		WebElement month= driver.findElement(By.id("month"));
		multipleWindowHandleByArrayList.selectFromDropdown(month, "Nov");
		
		WebElement year= driver.findElement(By.id("year"));
		multipleWindowHandleByArrayList.selectFromDropdown(year, "1993");
		
		multipleWindowHandleByArrayList.takeScreenshot("fb");
		
		driver.switchTo().window(arr.get(1));
		
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		multipleWindowHandleByArrayList.takeScreenshot("hrm");
		
		driver.switchTo().window(arr.get(0));
		
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.name("lname")).sendKeys("Auti");
		
		multipleWindowHandleByArrayList.takeScreenshot("main");
		
		driver.switchTo().window(arr.get(2));
		
		//System.out.println(driver.getTitle());
		
		driver.switchTo().window(arr.get(1));
		
		//System.out.println(driver.getTitle());
		
		driver.switchTo().window(arr.get(0));
		
		driver.findElement(By.partialLinkText("Google")).click();
		
		allwindow=driver.getWindowHandles();
		
		arr=new ArrayList<String>(allwindow);
		
		driver.switchTo().window(arr.get(3));
		
		//System.out.println(driver.getTitle());
		
        driver.switchTo().window(arr.get(0));
		
		System.out.println(driver.getTitle());
		
driver.switchTo().window(arr.get(1));
		
		System.out.println(driver.getTitle());
		
driver.switchTo().window(arr.get(2));
		
		System.out.println(driver.getTitle());
		
driver.switchTo().window(arr.get(3));
		
		System.out.println(driver.getTitle());
		
		
		
		
		
	}
	
	public void sreeenshot() throws IOException
	{
		String filename = null;

	TakesScreenshot ts=(TakesScreenshot) driver;

	File src=ts.getScreenshotAs(OutputType.FILE);

	File dest=new File(System.getProperty("user.dir")+"\\newScrnshot\\"+filename+".png");

	FileUtils.copyFile(src,dest);

	}

}
