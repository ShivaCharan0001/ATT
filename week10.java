package PB4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		Thread.sleep(2000);
		WebElement createAccount=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
		createAccount.click();
		Thread.sleep(2000);
		WebElement myselft=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
		myselft.click();
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstname.sendKeys("sirisha");
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastname.sendKeys("bevara");
		Thread.sleep(2000);
		WebElement btn1=driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
		btn1.click();
		Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		month.selectByValue("11");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		date.sendKeys("17");
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year.sendKeys("2005");
		Thread.sleep(2000);
		Select gender=new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
		gender.selectByValue("2");
		Thread.sleep(2000);
		WebElement btn2=driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
		btn2.click();
		Thread.sleep(2000);
		WebElement radiobtn=driver.findElement(By.xpath("//*[@id=\"selectionc3\"]"));
		radiobtn.click();		
		WebElement uid=driver.findElement(By.name("Username"));
		uid.sendKeys("sirishahgbh");
		WebElement btn3=driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
		btn3.click();
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.name("Passwd"));
		password.sendKeys("sanju@2303");
		Thread.sleep(5000);
		WebElement confirmpassword=driver.findElement(By.name("PasswdAgain"));
		confirmpassword.sendKeys("sanju@2303");
		Thread.sleep(5000);
		WebElement btn4=driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
		btn4.click();
		Thread.sleep(5000);
		
		
		
	}

}
