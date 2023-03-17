package assement1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Uibank {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("Eshwaa");
		   WebElement titleDropDown = driver.findElement(By.xpath("//select[@id = 'title']"));
	        Select selectDayDropDown = new Select(titleDropDown);
	        selectDayDropDown.selectByVisibleText("Mr");
	        driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("Kumar");
	        WebElement sexDropDown = driver.findElement(By.xpath("//select[@id = 'sex']"));
	        Select selectsexDropDown = new Select(sexDropDown);
	        selectsexDropDown.selectByVisibleText("Male");
	        WebElement empDropDown = driver.findElement(By.xpath("//select[@id = 'employmentStatus']"));
	        Select selectempDropDown = new Select(empDropDown);
	        selectempDropDown.selectByVisibleText("Unemployed");
	        
	        
	        
	}

}
