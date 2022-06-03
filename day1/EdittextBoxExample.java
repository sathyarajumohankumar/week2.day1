package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdittextBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");

driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("sathya");
driver.findElement(By.id("email")).sendKeys("pavi");
driver.findElement(By.id("email")).sendKeys("sathya@gmail.com");
driver.findElement(By.id("email")).clear();

String valuee=driver.findElement(By.id("email")).getAttribute("valuee");
System.out.println(valuee);



driver.findElement(By.name("username")).clear(); 
boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();

System.out.println(enabled);
}

}
