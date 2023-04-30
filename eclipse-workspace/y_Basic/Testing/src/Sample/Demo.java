package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kisho\\eclipse-workspace\\Testing\\src\\drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("https://www.youtube.com/watch?v=Umqb9KENgmk");
		
		//driver.close();
		
	}
}
