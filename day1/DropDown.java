package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
WebElement ele=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select ss=new Select(ele);
ss.selectByVisibleText("Conference");
	}

}
