package io.cucumber.reusablemethods;


import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization  {

	private static final String URL = "https://www.webstaurantstore.com/";
	
    protected WebDriver driver = null;
    private static final long IMPLICIT_TIME = 7;


    public void loadurl() {
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_TIME, SECONDS);
        driver.manage().window().maximize();
    }
    public void loadurlGoogle() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().timeouts().implicitlyWait(IMPLICIT_TIME, SECONDS);
        driver.manage().window().maximize();
    }


    public void close() {
        if (driver != null)
            driver.quit();
    }
}
