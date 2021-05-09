package seleniumDemos;
/*
 * //Not working becoz of exe problem
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws InterruptedException {
	  String sFile=System.getProperty("user.dir")+"utility/msedgedriver.exe";
	  System.out.println(sFile);
	  
	 System.setProperty("webdriver.edge.driver", sFile);
	 
	 WebDriver driver=new EdgeDriver();
	  driver.get("https://www.msn.com/");
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(5000);
	   driver.quit();

	}

}


