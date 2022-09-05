package com.testng.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;


public class UserRegistrationDemo {

	public WebDriver driver;

	// Parameterizing all WebElement paths
	//Build8

	String titleLocator = "//*[text()='Register For Demo']";
	String firstNameLocator = "vfb-5";
	String lastNameLocator = "vfb-7";
	String femaleGenderLocator = "vfb-8-2";
	String streetAddressLocator = "vfb-13-address";
	String aptSuiteBldgLocator = "vfb-13-address-2";
	String stateLocator = "vfb-13-state";
	String cityLocator = "vfb-13-city";
	String postalZipLocator = "vfb-13-zip";
	String countryLocator = "//select[@id='vfb-13-country']";
	String emailLocator = "//input[@id='vfb-14']";
	String timeHhLocator = "//select[@id='vfb-16-hour']";
	String timeMmLocator = "//select[@id='vfb-16-min']";
	String dateLocator = "vfb-18";
	String mobileNumberLocator = "//input[@id='vfb-19']";
	String uftCourseLocator = "vfb-20-1";
	String javaCourseLocator = "vfb-20-3";
	String enterYourQueryLocator = "//*[@id=\"vfb-23\"]";
	String verificationMsgLocator = "//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label";
	String verificationBoxLocator = "//*[@id=\"vfb-3\"]";
	String submitButtonLocator = "vfb-4";
	String successMsgLocator = "//*[@class='elementor-shortcode']";
	String qaAutomationLocator = "QA AUTOMATION";
	String practiceAutomationLocator = "Practice Automation";
	String registerPageLocator = "Demo Site – Registration Form";

	// Parameterizing all input values

	String url = "https://nxtgenaiacademy.com";
	String firstNameValue = "Nazz";
	String lastNameValue = "Z";
	String streetAddressValue = "Baderpur";
	String aptNumberValue = "A1";
	String stateValue = "Delhi";
	String cityValue = "New Delhi";
	String postalValue = "110000";
	String emailValue = "demo@gmail.com";
	String mmValue = "30";
	String hhValue = "10";
	String countryListValue = "India";
	String mobileValue = "9009000022";
	String dateValue = "30/07/2022";
	String yourQueryValue = "What about automation testing?";

	// Declaring all expected values
	
	String expectedTitle = "Register For Demo";
	String expectedSuccessMsg = "Registration Form is Successfully Submitted.";

	@BeforeClass
	public void launchApplication() {

		// Setting system property for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// Creating instance of Chrome driver
		driver = new ChromeDriver();

		// Launching the URL
		driver.get(url);

		// Maximizing the web application
		driver.manage().window().maximize();

		System.out.println("Application succesfully launched");
	}

	@AfterClass
	public void closeApplication() {

		// Close the application
		driver.close();
		System.out.println("\nApplication successfully closed");
	}

	@Test(priority = 1)
	public void navigateToRegistrationForm() {

		// Instance Creation for Action Class
		Actions navigate = new Actions(driver);

		/*
		 * Performing mouse hover to open registration form
		 */

		// Moving to QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText(qaAutomationLocator));
		if (qaAutomation.isDisplayed()) {
			System.out.println("\nQA AUTOMATION is displayed");
		} else {
			System.out.println("QA AUTOMATION is not displayed");
		}
		if (qaAutomation.isEnabled()) {
			System.out.println("QA AUTOMATION is enabled ");
			navigate.moveToElement(qaAutomation).perform();
		} else {
			System.out.println("QA AUTOMATION is not enabled ");
		}

		// Moving to Practice Automation
		WebElement practiceAutomation = driver.findElement(By.linkText(practiceAutomationLocator));
		if (practiceAutomation.isDisplayed()) {
			System.out.println("Practice Automation is displayed");
		} else {
			System.out.println("Practice Automation is not displayed");
		}
		if (practiceAutomation.isEnabled()) {
			System.out.println("Practice Automation is enabled");
			navigate.moveToElement(practiceAutomation).perform();
		} else {
			System.out.println("Practice Automation is not enabled");
		}

		// Selecting Demo Site - Registration Form
		WebElement demoRegistrationPage = driver.findElement(By.linkText(registerPageLocator));
		if (demoRegistrationPage.isDisplayed()) {
			System.out.println("Demo Site - Registration Form is displayed");
		} else {
			System.out.println("Demo Site - Registration Form is not displayed");
		}
		if (demoRegistrationPage.isEnabled()) {
			System.out.println("Demo Site - Registration Form is enabled");
			demoRegistrationPage.click();
			System.out.println("Demo Site - Registration Form is clicked");
		} else {
			System.out.println("Demo Site - Registration Form is not enabled");
		}
	}

	@Test(priority = 2)
	public void titleValidation() {

		/*
		 * Registration form title verification and validation
		 */

		// Title Verification
		WebElement regTitleText = driver.findElement(By.xpath(titleLocator));
		String actualTitle = regTitleText.getText();
		if (regTitleText.isDisplayed()) {
			System.out.println("\nRegistration title is displayed");
		} else {
			System.out.println("Registration title is not displayed");
		}

		// Title validation
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Registration title of the page is validated");
			System.out.println("Registration title of the page is - " + actualTitle);
		} else {
			System.out.println("The Actual and Expected title are not same");
			System.out.println("The Actual title is " + actualTitle);
			System.out.println("The Expected title is " + expectedTitle);
		}
	}

	@Test(priority = 3)
	public void userRegistration() {

		/*
		 * Enter the values in registration form
		 */

		// First Name

		WebElement firstName = driver.findElement(By.id(firstNameLocator));
		if (firstName.isDisplayed()) {
			System.out.println("\nFirst Name is displayed");
		} else {
			System.out.println("First Name is not displayed");
		}
		if (firstName.isEnabled()) {
			System.out.println("First Name box is enabled");
			// Enter First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name value is - " + firstNameValue);
		} else {
			System.out.println("First Name box is not enabled");
		}

		// Last Name

		WebElement lastName = driver.findElement(By.id(lastNameLocator));
		if (lastName.isDisplayed()) {
			System.out.println("\nLast Name is displayed");
		} else {
			System.out.println("Last Name is not displayed");
		}
		if (lastName.isEnabled()) {
			System.out.println("Last Name box is enabled");
			// Enter The Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name value is - " + lastNameValue);
		} else {
			System.out.println("Last Name box is not enabled");
		}

		// Gender

		WebElement gender = driver.findElement(By.id(femaleGenderLocator));
		if (gender.isDisplayed()) {
			System.out.println("\nGender \"Female\" is displayed");
		} else {
			System.out.println("Gender \"Female\" is not displayed");
		}
		if (gender.isEnabled()) {
			System.out.println("Gender \"Female\" is enabled");

		} else {
			System.out.println("Gender \"Female\" is not enabled");
		}

		// Check whether gender is selected or not, if not then select female
		if (gender.isSelected()) {
			System.out.println("Gender \"Female\" is selected");
		} else {
			System.out.println("Gender \"Female\" is not selected by default");
			// Click female
			gender.click();
		}

		// Verify female gender selection
		if (gender.isSelected()) {
			System.out.println("Gender \"Female\" is selected");
		} else {
			System.out.println("Gender \"Female\" is not selected");
		}

		// Street Address

		WebElement streetAdd = driver.findElement(By.id(streetAddressLocator));
		if (streetAdd.isDisplayed()) {
			System.out.println("\nStreet Address is displayed");
		} else {
			System.out.println("Street Address is not displayed");
		}
		if (streetAdd.isEnabled()) {
			System.out.println("Street Address box is enabled");
			// Enter Street address
			streetAdd.sendKeys(streetAddressValue);
			System.out.println("Street Address value is - " + streetAddressValue);
		} else {
			System.out.println("Street Address box is not enabled");
		}

		// Apt, Suite, Bldg. (optional)

		WebElement aptNo = driver.findElement(By.id(aptSuiteBldgLocator));
		if (aptNo.isDisplayed()) {
			System.out.println("\nApt, Suite, Bldg. (optional) is displayed");
		} else {
			System.out.println("Apt, Suite, Bldg. (optional) is not displayed");
		}
		if (aptNo.isEnabled()) {
			System.out.println("Apt, Suite, Bldg. (optional) box is enabled");
			// Enter Apartment Number
			aptNo.sendKeys(aptNumberValue);
			System.out.println("Apt, Suite, Bldg. (optional) input value is - " + aptNumberValue);
		} else {
			System.out.println("Apt, Suite, Bldg. (optional) box is not enabled");
		}

		// State

		WebElement state = driver.findElement(By.id(stateLocator));
		if (state.isDisplayed()) {
			System.out.println("\nState / Province / Region is displayed");
		} else {
			System.out.println("State / Province / Region is not displayed");
		}
		if (state.isEnabled()) {
			System.out.println("State / Province / Region box is enabled");
			// Enter State Name
			state.sendKeys(stateValue);
			System.out.println("State / Province / Region input value is - " + stateValue);
		} else {
			System.out.println("State / Province / Region box is not enabled");
		}

		// City

		WebElement city = driver.findElement(By.id(cityLocator));
		if (city.isDisplayed()) {
			System.out.println("\nCity is displayed");
		} else {
			System.out.println("City is not displayed");
		}
		if (city.isEnabled()) {
			System.out.println("City box is enabled");
			// Enter City Name
			city.sendKeys(cityValue);
			System.out.println("City input value is - " + cityValue);
		} else {
			System.out.println("City box is not enabled");
		}

		// Postal/Zip Code

		WebElement zip = driver.findElement(By.id(postalZipLocator));
		if (zip.isDisplayed()) {
			System.out.println("\nPostal / Zip Code is displayed");
		} else {
			System.out.println("Postal / Zip Code is not displayed");
		}
		if (zip.isEnabled()) {
			System.out.println("Postal / Zip Code box is enabled");
			// Enter Postal Code
			zip.sendKeys(postalValue);
			System.out.println("Postal Code input value is - " + postalValue);
		} else {
			System.out.println("Postal / Zip Code box is not enabled");
		}

		// Country Drop Down

		WebElement countryDropDown = driver.findElement(By.xpath(countryLocator));
		// Instance creation for Select class
		Select conDropDown = new Select(countryDropDown);
		if (countryDropDown.isDisplayed()) {
			System.out.println("\nCountry drop down is displayed");
		} else {
			System.out.println("Country drop down is not displayed");
		}
		if (countryDropDown.isEnabled()) {
			System.out.println("Country drop down is enabled");
			// select country value
			conDropDown.selectByVisibleText(countryListValue);
			System.out.println("Country " + "\"" + countryListValue + "\"" + " is selected");
		} else {
			System.out.println("Country drop down is not enabled");
		}

		// Email

		WebElement email = driver.findElement(By.xpath(emailLocator));
		if (email.isDisplayed()) {
			System.out.println("\nEmail is displayed");
		} else {
			System.out.println("Email is not displayed");
		}
		if (email.isEnabled()) {
			System.out.println("Email box is enabled");
			// Enter Email
			email.sendKeys(emailValue);
			System.out.println("Email input value is - " + emailValue);
		} else {
			System.out.println("Email box is not enabled");
		}

		/*
		 * Convenient Time
		 */

		// Convenient Time HH
		WebElement hourDropDown = driver.findElement(By.xpath(timeHhLocator));
		// Instance creation for Select class
		Select hhDropDown = new Select(hourDropDown);
		if (hourDropDown.isDisplayed()) {
			System.out.println("\nConvenient Time HH drop down is displayed");
		} else {
			System.out.println("Convenient Time HH drop down is not displayed");
		}
		if (hourDropDown.isEnabled()) {
			System.out.println("Convenient Time HH drop down is enabled");
			// Select HH Value
			hhDropDown.selectByValue(hhValue);
			System.out.println("Convenient Time HH" +" "+ "\"" + hhValue + "\"" + " is selected");
		} else {
			System.out.println("Convenient Time HH drop down is not enabled");
		}

		// Convenient Time MM
		WebElement minuteDropDown = driver.findElement(By.xpath(timeMmLocator));
		// Instance creation for Select class
		Select mmDropDown = new Select(minuteDropDown);
		if (minuteDropDown.isDisplayed()) {
			System.out.println("\nConvenient Time MM drop down is displayed");
		} else {
			System.out.println("Convenient Time MM drop down is not displayed");
		}
		if (minuteDropDown.isEnabled()) {
			System.out.println("Convenient Time MM drop down is enabled");
			// Enter MM Value
			mmDropDown.selectByValue(mmValue);
			System.out.println("Convenient Time HH" +" "+ "\"" + mmValue + "\"" + " is selected");
		} else {
			System.out.println("Convenient Time MM drop down is not enabled");
		}

		// Date

		WebElement date = driver.findElement(By.id(dateLocator));
		if (date.isDisplayed()) {
			System.out.println("\nDate of Demo is displayed");
		} else {
			System.out.println("Date of Demo is not displayed");
		}
		if (date.isEnabled()) {
			System.out.println("Date of Demo box is enabled");
			// Enter Date
			date.sendKeys(dateValue);
			System.out.println("Date - Enter in MM/DD/YY Format, input value is - " + dateValue);
		} else {
			System.out.println("Date of Demo box is not enabled");
		}

		// Mobile

		WebElement mobile = driver.findElement(By.xpath(mobileNumberLocator));
		if (mobile.isDisplayed()) {
			System.out.println("\nMobile Number is displayed");
		} else {
			System.out.println("Mobile Number is not displayed");
		}
		if (mobile.isEnabled()) {
			System.out.println("Mobile Number box is enabled");
			// Enter Mobile Number
			mobile.sendKeys(mobileValue);
			System.out.println("Mobile Number input value is - " + mobileValue);
		} else {
			System.out.println("Mobile Number box is not enabled");
		}

		/*
		 * Select any two courses
		 */

		// Course Interested UFT
		WebElement courseUft = driver.findElement(By.id(uftCourseLocator));
		if (courseUft.isDisplayed()) {
			System.out.println("\nUFT Course is displayed");
		} else {
			System.out.println("UFT Course is not displayed");
		}
		if (courseUft.isEnabled()) {
			System.out.println("UFT Course is enabled");

		} else {
			System.out.println("UFT Course is not enabled");
		}
		// Check whether UFT course is selected or not, if not then select UFT
		if (courseUft.isSelected()) {
			System.out.println("UFT Course is selected");
		} else {
			System.out.println("UFT Course is not selected by default");
			// Click UFT Course
			courseUft.click();
		}
		// Verify UFT Course selection
		if (courseUft.isSelected()) {
			System.out.println("UFT Course is selected");
		} else {
			System.out.println("UFT Course is not selected");
		}

		// Course Interested Core Java
		WebElement courseJava = driver.findElement(By.id(javaCourseLocator));
		if (courseJava.isDisplayed()) {
			System.out.println("\nCore Java Course is displayed");
		} else {
			System.out.println("Core Java Course is not displayed");
		}
		if (courseJava.isEnabled()) {
			System.out.println("Core Java Course is enabled");

		} else {
			System.out.println("Core Java Course is not enabled");
		}
		// Check whether Core Java course is selected or not, if not then select Core
		// Java
		if (courseJava.isSelected()) {
			System.out.println("Core Java Course is selected");
		} else {
			System.out.println("Core Java Course is not selected by default");
			// Click Core Java Course
			courseJava.click();
		}
		// Verify Core Java Course selection
		if (courseJava.isSelected()) {
			System.out.println("Core Java Course is selected");
		} else {
			System.out.println("Core Java Course is not selected");
		}

		// Enter your query

		WebElement yourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		if (yourQuery.isDisplayed()) {
			System.out.println("\nEnter your query is displayed");
		} else {
			System.out.println("Enter your query is not displayed");
		}
		if (yourQuery.isEnabled()) {
			System.out.println("Enter your query box is enabled");
			yourQuery.sendKeys(yourQueryValue);
			System.out.println("The query value is - " + yourQueryValue);
		} else {
			System.out.println("Enter your query box is not enabled");
		}

		/*
		 * Retrieving Verification Value from the given sentence
		 */
		// Retrieve given sentence and input value
		WebElement verMsg = driver.findElement(By.xpath(verificationMsgLocator));
		if (verMsg.isDisplayed()) {
			System.out.println("\nVerification message is displayed");
			String exMsg = verMsg.getText();
			System.out.println("Verification message is - " + exMsg);
		} else {
			System.out.println("Verification message is not displayed");
		}

		// Inserting retrieved value in verification box
		WebElement verificationBox = driver.findElement(By.xpath(verificationBoxLocator));
		if (verificationBox.isDisplayed()) {
			System.out.println("Verification box is displayed");
		} else {
			System.out.println("Verification box is not displayed");
		}
		if (verificationBox.isEnabled()) {
			System.out.println("Verification box is enabled");
			String exMsg = verMsg.getText();
			String reMsg[] = exMsg.split(":");
			String verificationValue = reMsg[1].trim();
			// Enter retrieved verification value
			verificationBox.sendKeys(verificationValue);
			System.out.println("Verification value is - " + verificationValue);
		} else {
			System.out.println("Verification box is not enabled");
		}

		/*
		 * Tapping Submit Button
		 */

		WebElement submit = driver.findElement(By.id(submitButtonLocator));
		if (submit.isDisplayed()) {
			System.out.println("\nSUBMIT is displayed");
		} else {
			System.out.println("SUBMIT is not displayed");
		}
		if (submit.isEnabled()) {
			System.out.println("SUBMIT button is enabled");
			// Click on Submit Button
			submit.click();
			System.out.println("SUBMIT button is clicked");
		} else {
			System.out.println("SUBMIT button is not enabled");
		}
	}

	@Test(priority = 4)
	public void successMessageValidation() {

		/*
		 * Success message and Transaction Id verification and validation
		 */
		// Verification
		WebElement successMsg = driver.findElement(By.xpath(successMsgLocator));
		if (successMsg.isDisplayed()) {
			System.out.println("\nSuccess message is displayed");

			// Retrieving success message and verification input value
			String actualMsg = successMsg.getText();
			String actMsg[] = actualMsg.split(":");
			String tranMsg = actMsg[1].trim();

			// Validating success message and retrieving transaction id
			if (actualMsg.contains(expectedSuccessMsg)) {
				System.out.println("The Registration success message is validated");
				System.out.println("The message is - " + actMsg[0] + "is - " + tranMsg);
			} else {
				System.out.println("The Actual and Expected title are not same");
				System.out.println("The actual msg is " + actualMsg);
				System.out.println("The expected msg is " + expectedSuccessMsg);
			}
		} else {
			System.out.println("Success Message is not displayed");
		}
	}
}
