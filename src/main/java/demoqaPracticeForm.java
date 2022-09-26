import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaPracticeForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("https://demoqa.com/automation-practice-form")).click();
		
		//table
		//DEMOQA WEBSITE 
//		List<WebElement> wb=driver.findElements(By.xpath("//div[@class='rt-tbody']"));
//		System.out.println(wb.size());
//		
//		for(WebElement list:wb)
//		{
//			String a=list.getText();
//			
//			if(a.contains("Alden"))
//			{
//				System.out.println("Test case is passed");
//			}
//			
//			else 
//			{
//				System.out.println("Test caseis failed");
//			}
//		}
		
		//ORANGEHRM
		
//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		
//		driver.findElement(By.id("btnLogin")).click();
//		//it will click on PIM Link
//		driver.findElement(By.linkText("PIM")).click();
//		//it will click on add button
//		driver.findElement(By.id("btnAdd")).click();
//		
//		//enter fname and lname
//		driver.findElement(By.id("firstName")).sendKeys("abc");
//		
//		driver.findElement(By.id("lastName")).sendKeys("abc");
//		
//		//capture emp id
//		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
//		System.out.println(empid);
//		
//		//click on save button
//		driver.findElement(By.id("btnSave")).click();
//		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
//		List<WebElement> wb=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
//		
//		for(WebElement ls:wb)
//		{
//			if(ls.getText().equals(empid))
//			{
//				System.out.println("Employee created successfully");
//			}
//		}
		
		//REDBUS.IN
//		String mon="Nov 2022";
//		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
//		
//		
//		while(true){
//			String wb= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
//		if(wb.equals(mon))
//		{
//			break;
//		}
//		
//		else 
//		{
//			driver.findElement(By.xpath("//button[contains(text(),'>')]")).click();
//		}
//		}
//		
//		driver.findElement(By.xpath("//td[text()='21']")).click();
		
		//GOIBIBO
		driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']")).click();
		String monthnYear="November 2022";
		
		while(true) {
			
			String a=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		if(a.equals(monthnYear))
		{
			break;
		}
		
		else {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		}
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Day']//p[text()='23']")).click();
		
		driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
	}
		

}
