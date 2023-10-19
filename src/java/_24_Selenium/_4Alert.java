package _24_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class _4Alert extends BaseTest {// всплываюшее окно на сайте, работает без пути автоматический, не зависимо от web

    @Test
    public void testAlert() { //

        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void testAlert1() { //
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }
}

