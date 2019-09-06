package Testmanager.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manoj_task {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","mavenchrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.kloudlearn.com");
		driver.manage().window().maximize();
		
		//signup
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign up free ')]")).click();
	
	    //Register
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-heap-track-id='authlogin-register-btn']")).click();
	   
		//fields
		
		driver.findElement(By.xpath("//input[@id='org_email']")).sendKeys("music.sunnetha1@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("maheshrajesh");
		driver.findElement(By.xpath("//input[@id='org_name']")).sendKeys("suneetha");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("sangeetham");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("sunitha123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@data-heap-track-id='authregister-register-btn']")).click();
		driver.navigate().back(); 
		
		//create another user
		
	   
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-heap-track-id='authlogin-register-btn']")).click();
		driver.findElement(By.xpath("//input[@id='org_email']")).sendKeys("music.sunnetha2@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("suneethasangeetham");
		driver.findElement(By.xpath("//input[@id='org_name']")).sendKeys("mavenproject");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("elugu");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("manoj kumar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@data-heap-track-id='authregister-register-btn']")).click();
		driver.navigate().back(); 
		
		driver.findElement(By.xpath("//input[@data-test-id='email']")).sendKeys("music.suneetha1@gmail.com");
		driver.findElement(By.xpath("//input[@data-test-id='password']")).sendKeys("maheshrajesh");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/form/div[4]/div/div/span/div/div[2]/button")).click();
		
		driver.navigate().back(); 
driver.findElement(By.xpath("//button[contains(text(),'Sign up free ')]")).click();
		
	    //Register
	    Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@data-test-id='email']")).sendKeys("music.suneetha2@gmail.com");
		driver.findElement(By.xpath("//input[@data-test-id='password']")).sendKeys("suneethasangeetham");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/form/div[4]/div/div/span/div/div[2]/button")).click();
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//*[@id=\"right-click-menu\"]/div[1]/div/div/div[1]/div/div/div[2]/div[2]")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//*[@id=\"react-joyride-step-1\"]/div/div/div[1]/button)[2]")).click();
		Thread.sleep(6000);
        driver.findElement(By.xpath("//div[contains(text(),'Groups')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='createGroup']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='groupName']")).sendKeys("emindcreation");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='description']")).sendKeys("learning");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='searchField']")).sendKeys("sangeetham sunitha123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"right-click-menu\"]/div[1]/div/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div/div/form/div[4]/div/button[2]")).click();
		
	   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
