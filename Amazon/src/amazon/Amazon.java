	package amazon;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

public static void main(String args[]) throws InterruptedException
{
		//another way to call the file --WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2FPOCO-Xiome-Smartphone-Armored-Snapdragon%2Fdp%2FB07H6NJX5F%2Fref%3Dnav_signin%3Fcrid%3DCZ5AT6WO84G6%26keywords%3Dpoco%2Bf1%2Bmobile%26qid%3D1643881448%26sprefix%3Dpoco%2Bf1%2Bmobile%252Caps%252C654%26sr%3D8-1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//	Thread.sleep(2000);
//	
//	WebElement Emailid = driver.findElement(By.xpath("//input[@type='email']"));
//	Emailid.sendKeys("anjalithombe2352@gmail.com");
//	
//	Thread.sleep(2000);
//	
//	WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
//	Continue.click();
//	
//	Thread.sleep(2000);
//	
//	WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
//	Password.sendKeys("Anjali7768");
//	
//	Thread.sleep(2000);
//	
//	WebElement Signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
//	Signin.click();
//	
//	Thread.sleep(2000);
//	
	WebElement Serach = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Serach.sendKeys("poco f1 mobile");
	
	Thread.sleep(2000);
	
	WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchbutton.click();
	
	Thread.sleep(2000);
	
	WebElement selectimg=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
	selectimg.click();
	
	Thread.sleep(2000);
	
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles()) ;/// new tab handle by this method
    
	driver.switchTo().window(addr.get(1));                                        // to sift the selenium foced to new tab
	
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(2000);
	
	WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addtocart.click();
	
	Thread.sleep(2000);
	
//	WebElement Proceedtocheckout = driver.findElement(By.xpath("(//input[@class=\\\"a-button-input\\\"])[30]"));
//	Proceedtocheckout.click();
	
	Thread.sleep(4000);
	
	WebElement ProceedToCheckOut = driver.findElement(By.xpath("(//input[@class='a-button-input'])[25]"));
	ProceedToCheckOut.click();
	
	Thread.sleep(2000);
	
	WebElement Emailid = driver.findElement(By.xpath("//input[@type='email']"));
	Emailid.sendKeys("anjalithombe2352@gmail.com");
	
	Thread.sleep(2000);
	
	WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
	Continue.click();
	
	Thread.sleep(2000);
	
	WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
	Password.sendKeys("Anjali7768");
	
	Thread.sleep(2000);
	
	WebElement Signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	Signin.click();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	//WebElement Account = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	//Thread.sleep(2000);
	

//	WebElement YourAccount = driver.findElement(By.xpath("//span[text()='Your Account']"));
//	Actions act = new Actions(driver);
//	act.moveToElement(Account).perform();
//
//	act.moveToElement(YourAccount).click().build().perform();

//	System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://demo.guru99.com/test/drag_drop.html");
//	
//	driver.manage().window().maximize();
//
//	Thread.sleep(3000);
//	
//	WebElement sour = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
//
//	WebElement desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//	
//	Actions act = new Actions(driver);
//	act.dragAndDrop(sour, desti).perform();

	
}
}
