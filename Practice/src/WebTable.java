import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTable {
	
	public static void main(String[] args) 
	
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://oca-azure-test:8108/Login.aspx");
		
		driver.findElement(By.name("txtLogin")).sendKeys("bpo.admin@yopmail.com");
		driver.findElement(By.id("txtPassword")).sendKeys("123456");
		driver.findElement(By.name("btnSign")).click();
		//driver.findElement(By.xpath("[@id='txtLogin']")).click();
		driver.findElement(By.id("txtLogin")).click();
		
	}

}
