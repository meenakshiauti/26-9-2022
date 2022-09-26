import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIMPage_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		pwd.sendKeys("admin123");
		
		WebElement lgnBtn=driver.findElement(By.id("btnLogin"));
		lgnBtn.click();
		
		WebElement PIM_Menu=driver.findElement(By.id("menu_pim_viewPimModule"));
		PIM_Menu.click();
		
		WebElement addEmp=driver.findElement(By.id("btnAdd"));
		addEmp.click();
		
		WebElement FirstName=driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Meenakshi");
		
		WebElement MiddleName=driver.findElement(By.id("middleName"));
		MiddleName.sendKeys("Vilas");
		
		WebElement LastName=driver.findElement(By.id("lastName"));
		LastName.sendKeys("Auti");
		
		WebElement chk_CreateLoginDetails=driver.findElement(By.id("chkLogin"));
		chk_CreateLoginDetails.click();
		
		WebElement uName=driver.findElement(By.id("user_name"));
		uName.sendKeys("Meenakshi");
		
		WebElement password=driver.findElement(By.id("user_password"));
		password.sendKeys("Meenu123");
		
		WebElement cnfmPwd=driver.findElement(By.id("re_password"));
		cnfmPwd.sendKeys("Meenu123");
		
		WebElement saveBtn=driver.findElement(By.id("btnSave"));
		saveBtn.click();
		
		driver.close();

	}

}
