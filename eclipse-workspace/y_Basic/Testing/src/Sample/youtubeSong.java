package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeSong {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kisho\\eclipse-workspace\\Testing\\src\\drivers\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("tum hi ho");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']/ancestor::div[@class='style-scope ytd-masthead']/descendant::yt-icon[@class='style-scope ytd-searchbox'][2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//yt-formatted-string[.='\"Tum Hi Ho Aashiqui 2\" Full Video Song HD | Aditya Roy Kapur, Shraddha Kapoor | Music - Mithoon']/ancestor::div[@class='style-scope ytd-item-section-renderer']/descendant::yt-formatted-string[@class='style-scope ytd-video-renderer'][1]")).click();
	
	}
}
