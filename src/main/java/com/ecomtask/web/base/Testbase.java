package com.ecomtask.web.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

import com.ecomtask.web.util.TestUtil;

public class Testbase {

    public static WebDriver driver;
    static ChromeOptions option;
    FileInputStream objfile;
    static Properties props;

    public Testbase() {

        try {

            props = new Properties();
            objfile = new FileInputStream(
                    System.getProperty("user.dir") + "/src/main/java/com/ecomtask/web/config/config.properties");
            props.load(objfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {

        String browser = new String();
        if (browser.equals("chrome")) {

            option = new ChromeOptions();
            option.setExperimentalOption("exclude switches", Collections.singletonList("enable-automation"));
            option.setExperimentalOption("useautomationExtension", false);
            driver = new ChromeDriver(option);
        } else {
            driver = new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(props.getProperty("homeURL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.duration));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TestUtil.duration));
    }
}
