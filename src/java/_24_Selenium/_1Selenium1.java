package _24_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class _1Selenium1 {//инструмент для автоматизации Web приложений .
    //с его помощью можно заменить рутиные операции (например текстовый ввод).

    //Selenium работает только в той часть экрана, которая видна на экране. Т.е. он не кликнет на кнопку если она не видна на экране.


    //<div> - это контейнеры, чтобы знать где мы находимся.
    @Test
    public void testDemo1(){

        WebDriverManager.chromedriver().setup();//настроить ChromeDriver для подключения браузера

        WebDriver driver = new ChromeDriver();//creating instance of ChromeDriver
        //Методы:
        driver.manage().window().maximize();//на полное окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//максимально время загрузки -если больше ошибка
        driver.get("https://demoqa.com/text-box");//сайт

        // нахождение web елементов по id
        WebElement fullNameInputField =driver.findElement(By.id("userName"));//WebElement - мы сохраняем пишем елемент. Пишем то что в коде под id
        fullNameInputField.sendKeys("Almaz");//метод, пишем то что хотим вставить
        //command + f --> выводит на сайте где код строку где мы можем проверить дубликаты id
        //# + пишем название id

        WebElement fullMail = driver.findElement(By.id("userEmail"));//email
        fullMail.sendKeys("kaparov777almaz@gmail.com");

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Prague");

        WebElement address2 = driver.findElement(By.id("permanentAddress"));
        address2.sendKeys("Bishkek");

        JavascriptExecutor js = (JavascriptExecutor)driver;//этот код прокручивает сайт вниз, чтобы селениум все увидел и заработал.
        js.executeScript("window.scrollBy(0,250)","");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();//метод который кликает(нажимает)




    }
}
