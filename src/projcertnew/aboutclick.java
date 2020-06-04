package projcertnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class aboutclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//open the below link
		driver.get("http://34.67.40.226:8081");//http://34.67.40.226:8081/
		// click on images link in the google page. Wait till 5 sec for overall script execution.
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("About Us")).click();
	}

}
