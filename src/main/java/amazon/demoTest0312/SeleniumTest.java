package amazon.demoTest0312;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class SeleniumTest 
{
    public static void main( String[] args )
    {
        WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\eclipse-workspace\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Butterfly EKN 1.5-Litre Water Kettle (Silver with Black)");
		driver.findElement(By.xpath("//*[@class='nav-input' and @type='submit']")).click();		
    }
}
