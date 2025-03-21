package PB4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class week2 {
	public static void main(String []args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		WebElement customerlogin = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		Actions builder = new Actions(driver);
		builder.moveToElement(customerlogin).perform();
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		register.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//*[@id = \"acc_first_name\"]"));
		firstname.sendKeys("aaaaa");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("acc_last_name"));
		lastname.sendKeys("zzz");
		Thread.sleep(2000);
		WebElement emailid = driver.findElement(By.id("acc_user_email"));
		emailid.sendKeys("aaaa_zzz@gmail.com");
		Thread.sleep(2000);
		WebElement setpswd = driver.findElement(By.id("acc_user_password"));
		setpswd.sendKeys("12345");
		Thread.sleep(2000);
		WebElement confirmpswd = driver.findElement(By.id("acc_user_passconf"));
		confirmpswd.sendKeys("12345");
		Thread.sleep(2000);
		WebElement mobilenumber = driver.findElement(By.id("acc_mobile_no"));
		mobilenumber.sendKeys("9876543210");
		Thread.sleep(2000);
		WebElement regbtn = driver.findElement(By.xpath("//*[@id = \"modalUserLogin\"]/div/div/div[2]/form/button"));
		regbtn.click();
		Thread.sleep(2000);
		
	}
}
