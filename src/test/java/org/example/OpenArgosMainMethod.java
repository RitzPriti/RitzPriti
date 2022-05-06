package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenArgosMainMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver Driver1;
        WebDriverManager.chromedriver().setup();
        Driver1 = new ChromeDriver();
        Driver1.get("https://www.argos.co.uk/");
        Thread.sleep(5000);
        Driver1.close();

    }
}
