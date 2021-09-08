package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("I am learning java-selenium");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Rajesh\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(5000);
	driver.close();
	
	}

}
