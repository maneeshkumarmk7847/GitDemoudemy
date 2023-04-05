package infosys_maven_Pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

@Test
public class LoginTest {
	public void logInTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ManeeshKu\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lms.galgotiasuniversity.edu.in/");
		System.out.println("Done");
		driver.quit();
	}

}
