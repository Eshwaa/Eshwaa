package assement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		   driver.manage().window().maximize();


	        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
	        driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("dragon");
	        driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("empier");
	        driver.findElement(By.xpath("//input[contains(@name , 'reg_email')]")).sendKeys("9566963563");
	        driver.findElement(By.xpath("//input[contains(@name , 'reg_passwd')]")).sendKeys("empier@123");

	         
	        WebElement dayDropDown = driver.findElement(By.xpath("//select[@name = 'birthday_day']"));
	        
	        Select selectDayDropDown = new Select(dayDropDown);
	        selectDayDropDown.selectByVisibleText("06");

	         
	        WebElement monthDropDown = driver.findElement(By.xpath("//select[@name = 'birthday_month']"));
	         
	        Select selectMonthDropDown = new Select(monthDropDown);
	        selectMonthDropDown.selectByValue("06");

	         
	        WebElement yearDropDown = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
	         
	        Select selectYearDropDown = new Select(yearDropDown);
	        selectYearDropDown.selectByValue("2001");

	         
	        WebElement radio = driver.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]"));
	        radio.click();

		
	}
	}


