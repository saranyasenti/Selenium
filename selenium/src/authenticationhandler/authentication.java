package authenticationhandler;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class authentication {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
	    Runtime.getRuntime().exec("autoit//authenticationhandler.exe");
	    WebDriver driver = new 
	}

}
