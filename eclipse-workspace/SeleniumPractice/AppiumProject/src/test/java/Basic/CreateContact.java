package Basic;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateContact {

	public static void main(String[] args) throws Exception {
		
		// Appium Server URL
        URL url = new URL("http://127.0.0.1:4723/");

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Arpit");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setUdid("1398796045001TA");
        options.setAppPackage("com.google.android.dialer");
        options.setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ===============================
        // Click on Contact Tab
        // ===============================
        WebElement contactTab = driver.findElement(
                By.id("com.google.android.dialer:id/tab_contacts"));
        if (contactTab.isDisplayed()) {
            contactTab.click();
            System.out.println("Contact tab is clicked");
        } else {
            System.out.println("Unable to click Contact tab");
        }

        // ===============================
        // Create New Contact
        // ===============================
        WebElement createNewContact = driver.findElement(
                By.xpath("//*[@text='Create new contact']"));
        if (createNewContact.isDisplayed()) {
            createNewContact.click();
            System.out.println("Create New Contact clicked");
        } else {
            System.out.println("Unable to click Create New Contact");
        }

        // ===============================
        // Enter First Name
        // ===============================
        WebElement firstName = driver.findElement(
                By.xpath("//*[@text='First name']"));
        if (firstName.isDisplayed()) {
            firstName.sendKeys("Testing");
            System.out.println("First name entered");
        } else {
            System.out.println("Unable to enter first name");
        }

        // ===============================
        // Enter Last Name
        // ===============================
        WebElement lastName = driver.findElement(
                By.xpath("//*[@text='Last name']"));
        if (lastName.isDisplayed()) {
            lastName.sendKeys("User");
            System.out.println("Last name entered");
        } else {
            System.out.println("Unable to enter last name");
        }

        // ===============================
        // Enter Phone Number
        // ===============================
        WebElement phoneNumber = driver.findElement(
                By.xpath("//*[@text='Phone']"));
        if (phoneNumber.isDisplayed()) {
            phoneNumber.sendKeys("12345678");
            System.out.println("Phone number entered");
        } else {
            System.out.println("Unable to enter phone number");
        }

        // ===============================
        // Click Save Button
        // ===============================
        WebElement saveButton = driver.findElement(
                By.xpath("//*[@text='Save']"));
        if (saveButton.isDisplayed()) {
            saveButton.click();
            System.out.println("Save button clicked");
        } else {
            System.out.println("Unable to click Save button");
        }

        // ===============================
        // Search Created Contact
        // ===============================
        WebElement contactSearch = driver.findElement(
                By.xpath("//*[@text='Search contacts & places']"));
        if (contactSearch.isDisplayed()) {
            contactSearch.click();

            WebElement searchViewBox = driver.findElement(
                    By.id("com.google.android.dialer:id/open_search_view_edit_text"));
            searchViewBox.sendKeys("12345678");
            System.out.println("Phone number is displayed");
        } else {
            System.out.println("Contact search box is not displayed");
        }

        driver.quit();  // optional

	}

}
