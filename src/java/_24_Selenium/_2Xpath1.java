package _24_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
//Locators (нахождение) основные  - нужны для идентифицирования элементов на Web странице
    // 1. by id
    // 2. Xpath
    // 3. CSS Selector
//Locators не основные, почти не используются, более тяжело искать
// 1. Name
// 2. Class name
// 3. Partial link text
// 4. LinkText
// 5. TagName

public class _2Xpath1 {//это язык запросов к элементам xml или xhtml. В ручную ищем нужный нам элемент заходя в каждый кейс на коде сайта.
    // начинаем с верху и двгаемся вниз по каждой ступеньке, по тегам <div>  по ирархии (ищя какой элемент нам подходит светится)
    // xpath используем когда много дубликатов, минус в том что если внести изменения он может затерятся
    // command + f --> выводит на сайте поиск

        // XPath types :
    //  1. Absolute xpath - /html/head/.......   Ищем с самого начала. Не стабильный
    //  2. Relative xpath - //label[@id='userEmail-label']   нажимаем на кнопку (стрелка квадратик) и выбираем нужное поле, пишем "div" и его уникальный id

    @Test
    public void xpathTest(){ // 1.Absolute xpath
        WebDriverManager.chromedriver().setup();//настроить ChromeDriver для подключения браузера

        WebDriver driver = new ChromeDriver();//управляем браузером, мотор

        driver.manage().window().maximize();//на полное окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//максимально время загрузки - если больше ошибка !!!
        driver.get("https://demoqa.com/text-box");//сайт

        WebElement AbsoluteXpath = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[1]/label"));//путь локатора xpath
        //   как пирамида заходим последовательно и ищем пока не загорится нужный нам на сайте элемент
        // каждый "div" должен быть уникальным (1из1 в строке), если несколько "div" на одном уровне то пишем в скобках его порядок [1] or [2] итд

        String expectedEmailText = "Email";//проверяем есть ли такой текст на сайте
        System.out.println(AbsoluteXpath);//покажет локатор (путь)

        Assert.assertEquals(AbsoluteXpath.getText(),expectedEmailText);//сравнение фактического и ожидаемого результата



        // 2. Relative xpath
        WebElement RelativeXpath = driver.findElement(By.xpath("//label[@id='userEmail-label']"));

        String expectedEmailText2 = "Email";//проверяем есть ли такой текст на сайте
        System.out.println(RelativeXpath);//покажет локатор (путь)

        Assert.assertTrue(expectedEmailText2.contains(RelativeXpath.getText()));//сравнение фактического и ожидаемого результата другим способом





    }
}
