package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest   // ← make sure { is here
{

    @Test
    public void testLogin()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Test executed");
        driver.quit();
    }

}  
