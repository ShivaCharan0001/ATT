package PB4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week3 {
	public static void main(String []args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("aaa");
		Thread.sleep(500);
		WebElement surName=driver.findElement(By.name("lastname"));
		surName.sendKeys("Kamatam");
		Thread.sleep(500);
		WebElement moblieNoOrEmailId=driver.findElement(By.name("reg_email__"));
		moblieNoOrEmailId.sendKeys("1234567890");
		Thread.sleep(500);
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("123akash");
		Select dateDropdown=new Select(driver.findElement(By.name("birthday_day")));
		dateDropdown.selectByValue("8");
		Thread.sleep(500);
		Select monthDropdown=new Select(driver.findElement(By.name("birthday_month")));
		monthDropdown.selectByVisibleText("Feb");
		Thread.sleep(500);
		Select yearDropdown=new Select(driver.findElement(By.name("birthday_year")));
		yearDropdown.selectByValue("1997");
		Thread.sleep(500);
		WebElement femaleRadioBtn=driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
		femaleRadioBtn.click();
		Thread.sleep(500);
		WebElement signUpBtn=driver.findElement(By.name("websubmit"));
		signUpBtn.click();
	}
}
