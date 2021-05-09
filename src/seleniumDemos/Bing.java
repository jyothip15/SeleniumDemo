package seleniumDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {

	public static void main(String[] args) throws InterruptedException {
		String sFile=System.getProperty("user.dir")+"/utility/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",sFile);//setting system property for chrome driver
		
		WebDriver driver=new ChromeDriver();//launching chrome browser
		
		driver.get("https://www.bing.com/");//passing the url
		
		driver.manage().window().maximize();
		 
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
