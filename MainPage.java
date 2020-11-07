package SecuritizeAoutomationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	By do1Button = By.id("do1");
	By do2Button = By.id("do2");
	By sizeButtonIncresse = By.id("btnIncreaseFont");
	By sizeButtonDicress = By.id("btnDecreaseFont");
	By textFontSize = By.id("textFontSize");
	By sizeButtonDecress = By.id("btnDecreaseFont");
	By backGroundColorText = By.id("bgColor");
	By backGroundColor = By.id("formToColorize");
	By setButtonColor = By.id("btnSetBgColor");

	public void clickOnDo1ButtonVerifyButton1Disabbled(WebDriver driver) {
		driver.findElement(do1Button).click();
		WebElement button1 = driver.findElement(do1Button);
		if (button1.getAttribute("class").contains("disabled")) {
			System.out.println("doButton1 disabled doButton2 enabled");
		}
	};

	public void clickOnDo2ButtonVerifyButton2Disabbled(WebDriver driver) {
		driver.findElement(do2Button).click();
		WebElement button2 = driver.findElement(do2Button);
		if (button2.getAttribute("class").contains("disabled")) {
			System.out.println("do2Button disabled do1Button enabled");
		}
	};

	public void clickOnFontSizeButtonIncresse(WebDriver driver) {
		WebElement textFontBeforeIncrese = driver.findElement(textFontSize);
		String str = textFontBeforeIncrese.getCssValue("font-size");
		String beforeIncreseText = str.substring(0, str.length() - 2);
		int beforeIncerseTextConvertToNumber = Integer.parseInt(beforeIncreseText);
		System.out.println("font size before increse =" + beforeIncerseTextConvertToNumber);
		driver.findElement(sizeButtonIncresse).click();
		WebElement textFontAfterIncrese = driver.findElement(textFontSize);
		String str2 = textFontAfterIncrese.getCssValue("font-size");
		String afterIncreseText = str2.substring(0, str.length() - 2);
		int afterIncreseTextConvertToNumber = Integer.parseInt(afterIncreseText);
		System.out.println("font size after increase=" + afterIncreseTextConvertToNumber);
		if (afterIncreseTextConvertToNumber > beforeIncerseTextConvertToNumber) {
			System.out.println("The text is incerses");
		}
	};

	public void clickOnFontSizeButtonDexcress(WebDriver driver) {
		WebElement textFontBeforeDecress = driver.findElement(textFontSize);
		String str = textFontBeforeDecress.getCssValue("font-size");
		String beforeDecressText = str.substring(0, str.length() - 2);
		int beforeDecressTextConvertToNumber = Integer.parseInt(beforeDecressText);
		System.out.println("font size before increse =" + beforeDecressTextConvertToNumber);
		driver.findElement(sizeButtonDecress).click();
		WebElement textFontAfterDecress = driver.findElement(textFontSize);
		String str2 = textFontAfterDecress.getCssValue("font-size");
		String afterDecressText = str2.substring(0, str.length() - 2);
		int afterDecressTextConvertToNumber = Integer.parseInt(afterDecressText);
		System.out.println("font size after increase=" + afterDecressTextConvertToNumber);
		if (afterDecressTextConvertToNumber < beforeDecressTextConvertToNumber) {
			System.out.println("The text is decress");
		}
	};

	public void changeBackGroundColor(WebDriver driver, String color) {
		driver.findElement(backGroundColorText).sendKeys(color);
		WebElement newColor = driver.findElement(backGroundColor);
		driver.findElement(setButtonColor).click();
		if (newColor.getAttribute("style").contains(color)) {
			System.out.println("The color is change");
		}
	};
}