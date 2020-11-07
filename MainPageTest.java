package SecuritizeAoutomationTest;

import java.awt.AWTException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SecuritizeAoutomationPage.LoginPage;
import SecuritizeAoutomationPage.MainPage;

public class MainPageTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practis.co.il/automation/");
		driver.manage().window().maximize();
		LoginPage loginTest = new LoginPage();
		loginTest.insertUserName(driver, "admin");
		loginTest.insertPassword(driver, "admin");
		loginTest.clickOnLoginButton(driver);
		MainPage mainTest = new MainPage();
		mainTest.clickOnDo1ButtonVerifyButton1Disabbled(driver);
		mainTest.clickOnDo2ButtonVerifyButton2Disabbled(driver);
		mainTest.clickOnFontSizeButtonIncresse(driver);
		mainTest.clickOnFontSizeButtonDexcress(driver);
		mainTest.changeBackGroundColor(driver, "orange");
	}

}
