package com.ellsworthcarson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    final static String NAVER_URL = "https://szhsin.github.io/react-menu/#checkbox";

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get(NAVER_URL);
        WebElement style_btn = null;
        List<WebElement> buttons = driver.findElements(By.cssSelector("button[class='rc-menu-button']"));

        for (WebElement btn:buttons) {
            if(btn.getText().equals("Text style"))
            {
                btn.click();
                style_btn = btn;
                break;
            }
        }

        time_delay(2000);

        WebElement accountElement = driver.findElement(By.cssSelector("ul[aria-label='Text style']"));
        List<WebElement> li_ele =  accountElement.findElements(By.tagName("li"));

        //Bold
        li_ele.get(0).click();
        time_delay(2000);

        ///Italic
        style_btn.click();
        li_ele.get(1).click();
        time_delay(2000);

        //Underline
        style_btn.click();
        li_ele.get(2).click();
        time_delay(2000);

        driver.quit();
    }

    public static void time_delay(long times)
    {
        try
        {
            Thread.sleep(times);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
    }
}
