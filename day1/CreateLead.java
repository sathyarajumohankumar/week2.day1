package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://Leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("swetha");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("tharan");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("test");

driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("java");
driver.findElement(By.id("createLeadForm_description")).sendKeys("performance");


driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dad@gmail.com");
WebElement stapro = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select staprov=new Select(stapro);
staprov.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();

	
}

}
