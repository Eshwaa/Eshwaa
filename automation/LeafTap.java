package week4.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class LeafTap {
    public static void main(String[] args) {
                EdgeDriver driver = new EdgeDriver();
                driver.get("http://leaftaps.com/opentaps/control/main");
                driver.manage().window().maximize();
                driver.findElement(By.name("USERNAME")).sendKeys("DemosalesManager");
                driver.findElement(By.id("password")).sendKeys("crmsfa");
                driver.findElement(By.className("decorativeSubmit")).click();
                driver.findElement(By.linkText("CRM/SFA")).click();
                driver.findElement(By.linkText("Leads")).click();
                driver.findElement(By.linkText("Create Lead")).click();
                driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
                driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Eshwaa");
                driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
                driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Witch");
                driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
                driver.findElement(By.id("createLeadForm_description")).sendKeys("HI I am Eshwaa");
                driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("eshwaakumart@gmail.com");

                WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
                Select selectStateDropDown = new Select(stateDropDown);
                selectStateDropDown.selectByVisibleText("New York");
                driver.findElement(By.className("smallSubmit")).click();


                String expectedResult = "View Lead | opentaps CRM";
                String actualResult = driver.getTitle();

                if (actualResult.equals(expectedResult)){
                    System.out.println("Test pass");
                }
                else {
                    System.out.println("Test fail");
                }

    }
}
