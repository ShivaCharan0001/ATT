package PB4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week6 {

	public static void main(String args[]) 
			throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(1000);
		WebElement LoginButton=driver.findElement(By.id("loginAjio"));
		LoginButton.click();
		WebElement MobileNumber=driver.findElement(By.name("username"));
		MobileNumber.sendKeys("9492754372");
		WebElement ContinueButton=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input"));
		ContinueButton.click();
		Thread.sleep(2000);
		WebElement Name=driver.findElement(By.name("user-name"));
		Name.sendKeys("abc");
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.name("email-mob"));
		Email.sendKeys("abcdefghijabs@gmail.com");
		Thread.sleep(2000);
		WebElement Gender=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[3]/label[1]/span"));
		Gender.click();
		Thread.sleep(2000);
		WebElement Checkbox=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[10]/label/span"));
		Checkbox.click();
		Thread.sleep(2000);
		WebElement SendOtpButton=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[12]/input"));
		SendOtpButton.click();
		Thread.sleep(5000);
		WebElement otp=driver.findElement(By.name("otp"));
		otp.sendKeys("565656");
		WebElement signupButton=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div/div[3]/input"));
		signupButton.click();
	}

}
