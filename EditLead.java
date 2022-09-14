package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemosalesManager");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath(("//a[contains(text(),'CRM/SFA')]"))).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
	driver.findElement(By.xpath("//input[contains(@id,'ext-gen248')]")).sendKeys("b");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		driver.findElement((By.xpath("//a[@class='linktext']"))).click();
		
		
		String titlepage = driver.getTitle();

		System.out.println(titlepage);
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.xpath(("//input[@id='firstName']"))).sendKeys("Test");

		driver.findElement(By.xpath("//input[@onclick='submitFormWithSingleClick(this)']")).click();
		
		driver.close();
	}

}
