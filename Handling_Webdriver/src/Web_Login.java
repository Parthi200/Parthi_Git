import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Login {

	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?");
	    String expectedTitle = "Web Orders Login";
	    String actualTitle =driver.getTitle();
	    System.out.println(actualTitle);
	    if(expectedTitle.equals(actualTitle)){
	    	System.out.println("Test case is passed");
	    }else {
	    	System.out.println("Test case is failed");
	    }

	}

}
