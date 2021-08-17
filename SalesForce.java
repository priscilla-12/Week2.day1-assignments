package week2.day1assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

 

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 WebElement webUser=driver.findElement(By.name("CreateSalesForce_firstName"));
		 webUser.sendKeys("prisy");
		 WebElement webUser1=driver.findElement(By.name("CreateSalesForce_lastName"));
		 webUser1.sendKeys("kithi"); 
         driver.findElement(By.name("UserEmail")).sendKeys("priscilla7845@gmail.com");	
         driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
         driver.findElement(By.name("UserPhone")).sendKeys("7358307962");
         
         
        WebElement drpTitle = driver.findElement(By.name("UserTitle"));
 		Select title = new Select(drpTitle);
 		title.selectByIndex(2);
 		
 		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
 		
 		WebElement drpEmployee = driver.findElement(By.name("CompanyEmployees"));
 		Select employee = new Select(drpEmployee);
 		employee.selectByValue("250");
 		
 		WebElement drpCountry = driver.findElement(By.name("CompanyCountry"));
 		Select country = new Select(drpCountry);
 		country.selectByVisibleText("India");
         
 		driver.findElement(By.className("checkbox")).click();
 		
 		driver.close();
	}

}
