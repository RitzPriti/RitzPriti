package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPrimarkJunit {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openPri(){
        driver.get("https://www.primark.com/en-gb");
    }
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
