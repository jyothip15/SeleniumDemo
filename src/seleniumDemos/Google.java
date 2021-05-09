package seleniumDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Google {

	public static void main(String[] args) throws InterruptedException {
		// String File="C:/Jars/chromedriver-83/chromedriver.exe";
		
		String File = System.getProperty("user.dir")+"/utility/chromedriver.exe";
		System.out.println(File);
		System.setProperty("webdriver.chrome.driver",File);  // setting system property for the chrome driver

		WebDriver driver=new ChromeDriver();  // launching the chrome browser

		driver.get("https://www.google.com/");   // passed the url

		driver.manage().window().maximize();    // maximized the browser
		Thread.sleep(5000);
		driver.quit();                         // close the browser (closed all connections)
	}


}


