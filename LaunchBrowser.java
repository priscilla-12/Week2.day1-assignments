package week2.day1assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;   

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		 driver.findElement(By.partialLinkText("CRM/SFA")).click(); 
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Leads")).click();
		 
		 driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.linkText("CreateLeadForm_firstName")).sendKeys("prisy");
		 driver.findElement(By.linkText("CreateLeadForm_lastName")).sendKeys("kithi"); 
		 
		 WebElement CountryCode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	     CountryCode.clear();
	     CountryCode.sendKeys("91");
	     
	      
	     
	      
	     
	     String s3=driver.getTitle();
	     System.out.println(s3);
	     String s2="View Lead | opentaps CRM";
	     
	     if(s2.equals(s3))
	    	 System.out.println("Test Pass");

	     else
	     {
	    	 System.out.println("Test Fail");
	     }
		 
		 
		 
		 
		 WebElement drop1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dropdwn1=new Select(drop1);
		 dropdwn1.selectByIndex(0);
		 
		 WebElement drop2=driver.findElement(By.id("industryEnumId"));
		 Select dropdwn2=new Select(drop2);
		 dropdwn2.selectByValue("IND_DISTRIBUTION");
		 
		 WebElement drop3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dropdwn3=new Select(drop3);
		 dropdwn3.selectByVisibleText("corporation");
		 
		 driver.findElement(By.name("submitButton")).click();
		  
		 int sizeDropdwn3=dropdwn3.getOptions().size();
		 System.out.println("Size of the third dropdown:" +sizeDropdwn3);
		 
		 
		     

		 
		 
}


}