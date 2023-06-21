package amazonproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signupdetails {

	public void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Amazon.ca");
		driver.findElement(By.cssSelector("body")).click();
		driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]/span")).click();
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(2));
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("D:\\\\screenshot.jpg"));
		boolean v= driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		System.out.println(v);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList > span"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("vicky kaushal");
		driver.findElement(By.id("ap_email")).sendKeys("kalariavivek123@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("kaushal@123");
		driver.findElement(By.id("ap_password_check")).sendKeys("kaushal@123");
		driver.findElement(By.id("continue")).click();
		driver.close();
		
	}

}
