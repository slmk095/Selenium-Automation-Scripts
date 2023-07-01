
package com.slmk.test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        //refer:https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://techclass.com/ ";
        String expectedTitle = "TechClass";
        // Open Firefox and go to the Base URL
        driver.get(baseUrl);
        // get the title of web page and save it into string variable
        String actualTitle = driver.getTitle();
        /*
         * compare the actual title to the expected one and print the result
         */
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //close the web browser
        driver.close();

        // terminate the program
        System.exit(0);

    }
}
