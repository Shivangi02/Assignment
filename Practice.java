import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] s)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String selectedCheckbox=driver.findElement(By.xpath("//label/input[@id='checkBoxOption1']/parent::label")).getText();
		System.out.print(selectedCheckbox);

		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(dropdown);
		select.selectByVisibleText(selectedCheckbox);
		driver.findElement(By.id("name")).sendKeys(selectedCheckbox);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		if(alertText.contains(selectedCheckbox))
			System.out.println(selectedCheckbox+"is present");
		else
			
			System.out.println(selectedCheckbox+"is not present");

		
	
		
	}

}
