package com.slmk.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondSelenium {
    public static void main(String[] args)  {
        //refer:https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        String appUrl = "https://techclass.com/";
        driver.get(appUrl);

        String title = driver.getTitle();
        String expectedUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(appUrl)) {
            System.out.println("Test Passed! its the Desired page");

        } else {
            System.out.println("Test Failed");
        }

        String sourcecode = driver.getPageSource();
        int p1 = sourcecode.length();

        System.out.println("The Page Title is " +title);
        System.out.println("The Page Url is " +appUrl);
        System.out.println(" The Page source code is " +sourcecode);
        System.out.println("The Length of Page source code is " +p1);

        driver.close();

        // terminate the program
        System.exit(0);

    }

}