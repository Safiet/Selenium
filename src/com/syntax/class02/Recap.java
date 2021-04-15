package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(100);
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Facebook - Log In or Sign Up")){
            System.out.println("Title is RIGHT");
        }else{
            System.out.println("Title is WRONG");
        }
        driver.quit();
    }
}
