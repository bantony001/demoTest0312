package amazon.demoTest0312;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class SeleniumTest 
{
    public static void main( String[] args ) throws IOException
    {
    	File fi = new File("D:\\Softwares\\eclipse-workspace\\demoTest0312\\testdata.xlsx");
    	FileInputStream fis = new FileInputStream(fi);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet ws = wb.getSheetAt(0);
    	
    	String value = ws.getRow(1).getCell(0).getStringCellValue();
    	System.out.println(value);
    	
        WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\eclipse-workspace\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Butterfly EKN 1.5-Litre Water Kettle (Silver with Black)");
		driver.findElement(By.xpath("//*[@class='nav-input' and @type='submit']")).click();		
    }
}
