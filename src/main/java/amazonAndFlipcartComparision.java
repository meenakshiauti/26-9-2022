import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAndFlipcartComparision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "F:\\Praful Sir Softech Class\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("APPLE iPhone 13 (Starlight, 256 GB)");
		
		driver.findElement(By.xpath("//*[@width='20']")).click();
		
		Thread.sleep(5000);
		
	WebElement wb=	driver.findElement(By.xpath("//div[@data-id='MOBG6VF5ADKHKXFX']//div[@class='_30jeq3 _1_WHN1']"));
		
		System.out.println("Flipcart price is "+wb.getText());
		
		String flpPrice=wb.getText();
		
		driver.navigate().to(" https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 13 (256GB) - Starlight");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	WebElement wb2=	driver.findElement(By.xpath("//div[@data-asin='B09G9BFKZN']//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']"));

	    System.out.println("Amazon price is "+wb2.getText());
	    
	    String amzPrice=wb2.getText();
	    
	    String a=flpPrice.replaceAll("[^0-9]", "");
	    String b=amzPrice.replaceAll("[^0-9]", "");
	    
	    int fInt=Integer.parseInt(a);
	    int aInt=Integer.parseInt(b);
	    
	    System.out.println(a);
	    System.out.println(b);
	    
	    if(fInt>aInt)
	    {
	    	System.out.println("Flipcart Price is More Than Amazon");
	    }
	    
	    else
	    {
	    	System.out.println("Amazon Price is More Than Flipcart");
	    }
	    
	    driver.close();
	}

}
