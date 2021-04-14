package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class LaunchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //set properties first

        WebDriver driver =new ChromeDriver(); // launch the browser
        driver.get("http:www.google.com"); // navigate to the website
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(url+" "+title);
        driver.quit();
    }
}
