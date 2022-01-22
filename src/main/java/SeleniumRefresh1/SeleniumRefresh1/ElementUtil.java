package SeleniumRefresh1.SeleniumRefresh1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	
	
	
	

	public static void main(String[] args) {
		
		By Username=By.id("username");
		By password=By.id("password");
		
		
		ElementUtil.getElement(Username);
		ElementUtil.getElement(password);
		WebDriver driver=new ChromeDriver();
		waitForElementPresent(driver, 10, Username);
		
}
	
	public static WebElement getElement(By locators) {
		
		WebDriver driver=new ChromeDriver();
		WebElement element=driver.findElement(locators);
		return element;
	}
	
	public static void waitForElementPresent(WebDriver driver,int timout, By locator) {
		WebDriverWait wait=new WebDriverWait(driver,timout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
