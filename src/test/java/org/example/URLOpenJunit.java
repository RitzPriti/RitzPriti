package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLOpenJunit {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openBBC(){
        driver.get("https://www.bbc.co.uk/");
    }
    @Test
    public void openNext(){
        driver.get("https://www.next.co.uk/");
    }
    @After
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }
}
