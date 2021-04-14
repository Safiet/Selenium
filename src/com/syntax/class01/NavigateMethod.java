package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
              driver.get("http://facebook.com");
                driver.navigate().to("http://google.com");
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                driver.navigate().forward();
                Thread.sleep(1000);
                driver.navigate().refresh();
                // driver.quit(); ---- will close all session all tabs will be closed
        driver.close(); // ---- will close just a current tab



    }
}
