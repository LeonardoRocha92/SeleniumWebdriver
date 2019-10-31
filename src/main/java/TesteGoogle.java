import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/leo/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		System.out.println(driver.getTitle());// teste
	}

}
