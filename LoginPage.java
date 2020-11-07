package SecuritizeAoutomationPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	By userName = By.name("username");
	By password = By.name("password");
	By loginButton = By.name("login");

	public void insertUserName(WebDriver driver, String inserUserName) {
		driver.findElement(userName).sendKeys(inserUserName);
	};

	public void insertPassword(WebDriver driver, String insertPassword) {
		driver.findElement(password).sendKeys(insertPassword);
	};

	public void clickOnLoginButton(WebDriver driver) {
		driver.findElement(loginButton).click();
	};
}
