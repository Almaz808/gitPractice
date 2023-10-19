package _24_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class _3CssSelector {
    //после # в коде сайта всегда идет id
    @Test
    public void cssTest1() { //  2.Css Selector xpath
        WebDriverManager.chromedriver().setup();//настроить ChromeDriver для подключения браузера
        WebDriver driver = new ChromeDriver();//управляем браузером, мотор
        driver.manage().window().maximize();//на полное окно
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//максимально время загрузки - если больше ошибка !!!

        driver.get("https://www.amazon.com/");//сайт
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);//id и то что ищем, доступ к клавиатуре и нажимвет Enter

        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));//если нет id то ищем по "li"
        System.out.println(appleText.getText());//выводит на кансоли слово Apple


        //Checkbox - несколько выборов
        //Radiobutton - только один (да или нет)


    }
}
