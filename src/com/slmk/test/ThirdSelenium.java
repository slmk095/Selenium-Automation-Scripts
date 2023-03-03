package com.slmk.test;

import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdSelenium {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://github.com/join");
//wait for dynamic elements appear
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
        System.out.println("Username field is visible");
        
        Alert alert=driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        driver.findElement(By.id("user_login")).sendKeys("Username");
//check the expected conditions for Email field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        System.out.println("Email field is visible");
        driver.findElement(By.id("user_email")).sendKeys("email@test.com");
//check the expected conditions for Password field
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_password")));
        System.out.println("Password field is visible");
        driver.findElement(By.id("user_password")).sendKeys("password");
//identify the go button
        driver.findElement(By.id("signup_button")).click();
//close the browser
        driver.close();
    }
}


