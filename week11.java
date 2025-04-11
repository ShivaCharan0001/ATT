package PB4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("chrome-win64 (3)","C:\\Users\\CMRCP\\Downloads\\chrome-win64 (3).zip\\chrome-win64");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://www.google.co.in/");
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("Myntra");
		searchBar.submit();
		Thread.sleep(30000);
		WebElement myntraLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div/div/span/a/h3"));
		myntraLink.click();
		WebElement profileHyperLink = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[1]"));
		profileHyperLink.click();
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a"));
		loginBtn.click();
		WebElement mobileNo = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input"));
		mobileNo.sendKeys("9999999999");
		WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]"));
		continueBtn.click();
		Thread.sleep(5000);
		WebElement otp01 = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[1]"));
		otp01.sendKeys("1");
		WebElement otp02 = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[2]"));
		otp02.sendKeys("2");
		WebElement otp03 = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[3]"));
		otp03.sendKeys("3");
		WebElement otp04 = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div[2]/div[1]/input[4]"));
		otp04.sendKeys("4");
		driver.close();
		
	}

}
