package myproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) {
	System.setProperty("driver.chrome.driver", "C:/selenium/ChromeSetup.exe");
	WebDriver driver=new ChromeDriver();

	}

}
