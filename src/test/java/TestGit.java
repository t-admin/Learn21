import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class TestGit {
	
		public static WebDriver driver;
		@BeforeSuite
		public void setup() {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\tsneh\\OneDrive\\Documents\\Jars\\gecko\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		@Test
		public void doLogin(){
			
			driver.get("https://gmail.com");
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sneha.thadishetty");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
			//driver.findElement(By.type("password")).sendkeys("sjkkjb");
			
			
		}
		@AfterSuite
		public void teardown(){
			driver.quit();
		}
		
		

	}


