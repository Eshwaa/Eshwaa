package assement1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class Matrimony {


	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get( "https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		
		
		 WebElement findElementDropDown = driver.findElement(By.id("REGISTERED_BY")); 
		Select selectFindElementDropDown = new Select(findElementDropDown);
		selectFindElementDropDown.selectByValue("1");
		driver.findElement(By.id("NAME")).sendKeys("vasanth");
		WebElement findElementdate = driver.findElement( By.id("DOBDAY"));
		Select selectfindElementDate=new Select(findElementdate);
		selectfindElementDate.selectByValue("26");
		WebElement findElementMonth = driver.findElement( By.id("DOBMONTH"));
		Select selectfindElementMonth=new Select(findElementMonth);
		selectfindElementMonth.selectByValue("4");
		WebElement findElementYear = driver.findElement( By.id("DOBYEAR"));
		Select selectfindElementYear=new Select(findElementYear);
		selectfindElementYear.selectByValue("2001");
		WebElement findElementReligion = driver.findElement( By.id("RELIGION"));
		Select selectfindElementReligion=new Select(findElementReligion);
		selectfindElementReligion.selectByValue("1");
		WebElement findElementTongue = driver.findElement( By.id("MOTHERTONGUE"));
		Select selectfindElementTongue=new Select(findElementTongue);
		selectfindElementTongue.selectByValue("47");
		WebElement findElementCountry = driver.findElement( By.id("COUNTRY"));
		Select selectfindElementCountry=new Select(findElementCountry);
		selectfindElementCountry.selectByValue("98");
		WebElement findElementCode = driver.findElement( By.id("M_COUNTRYCODE"));
		Select selectfindElementCode=new Select(findElementCode);
		selectfindElementCode.selectByValue("98");
		
		
		
		driver.findElement(By.id("gendermale")).click();
		driver.findElement(By.id("MOBILENO")).sendKeys("7358060568");
		driver.findElement(By.id("EMAIL")).sendKeys("vasanth@gamil.com");
		driver.findElement(By.name("PASSWD1")).sendKeys("vasanthphotographer");
		//
 
		
	}

}
