import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class endToEndFlowOfOrangeHRM {
	
	

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("Email")).sendKeys("Jack@gmail.com");
//		
//		driver.findElement(By.id("Password")).sendKeys("Jack@12345");
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();
		
		
		
		
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		pwd.sendKeys("admin123");
		
		WebElement lgnBtn=driver.findElement(By.id("btnLogin"));
		lgnBtn.click();
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		pim.click();
		
		WebElement addEmp=driver.findElement(By.id("menu_pim_addEmployee"));
		addEmp.click();
		
		WebElement fstName=driver.findElement(By.id("firstName"));
		fstName.sendKeys("Jack0975");
		
		WebElement lstName=driver.findElement(By.id("lastName"));
		lstName.sendKeys("Patil4326");
		
		WebElement EmpId=driver.findElement(By.id("employeeId"));
		String EmployeeId=EmpId.getAttribute("value");
		
//		WebElement credentailCheckbox=driver.findElement(By.id("chkLogin"));
//		credentailCheckbox.click();
//		
//		WebElement uName=driver.findElement(By.id("user_name"));
//		uName.sendKeys("jackpanda123");
//		
//		WebElement password=driver.findElement(By.id("user_password"));
//		password.sendKeys("Meenu123");
//		
//		WebElement cnfmPwd=driver.findElement(By.id("re_password"));
//		cnfmPwd.sendKeys("Meenu123");
		
		WebElement saveBtn=driver.findElement(By.id("btnSave"));
		saveBtn.click();
		
		Thread.sleep(5000);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)", "");
		
		WebElement edit=driver.findElement(By.id("btnSave"));
		edit.click();
		
		WebElement femaleRdo=driver.findElement(By.id("personal_optGender_2"));
		femaleRdo.click();
		
		WebElement marritalStatus=driver.findElement(By.id("personal_cmbMarital"));
		Select sel=new Select(marritalStatus);
		sel.selectByVisibleText("Married");
		
		WebElement nationality=driver.findElement(By.id("personal_cmbNation"));
		Select sel1=new Select(nationality);
		sel1.selectByVisibleText("Indian");
		
		Thread.sleep(5000);
	
		WebElement saveBtn1=driver.findElement(By.id("btnSave"));
		saveBtn1.click();
		
		Thread.sleep(5000);
		
		WebElement EmpList=driver.findElement(By.id("menu_pim_viewEmployeeList"));
		EmpList.click();
		
		Thread.sleep(5000);
		
		WebElement id=driver.findElement(By.id("empsearch_id"));
		id.sendKeys(EmployeeId);
		
		Thread.sleep(5000);
		
		WebElement serchBtn=driver.findElement(By.id("searchBtn"));
		serchBtn.click();
		
		Thread.sleep(5000);
		
		WebElement serchCheckbox=driver.findElement(By.id("ohrmList_chkSelectAll"));
		serchCheckbox.click();
		
		WebElement deleteBtn=driver.findElement(By.id("btnDelete"));
		deleteBtn.click();
		
		WebElement dialogdeleteBtn=driver.findElement(By.id("dialogDeleteBtn"));
		dialogdeleteBtn.click();
		
		driver.close();
}

}
