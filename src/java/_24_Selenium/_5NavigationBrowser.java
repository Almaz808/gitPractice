package _24_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _5NavigationBrowser extends BaseTest {//Класс Actions — это возможность, предоставляемая Selenium для обработки событий клавиатуры и мыши.
    @Test
    public void test1(){//меод navigate.to отличается от get, тем что navigate.to может возвращатся на пред страницу(назад)

        driver.navigate().to("https://www.imoving.com/");
        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));
        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1080");
        WebElement moveSizeMenu = driver.findElement(By.id("hp-nav-select-house"));
        Select select2 = new Select(moveSizeMenu);
        select2.selectByVisibleText("Just a few Items");
        WebElement clickQuotes = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        clickQuotes.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/full-inventory/#!/");
        driver.navigate().back();//driver.navigate().back(); // Navigate открывает ссылку, back метод возвращает обратно (назад)


        Assert.assertEquals(driver.getCurrentUrl(),"https://www.imoving.com/");
    }

    //Explicit wait - Явное ожидание
    //iFrame — элемент HTML, позволяющий встраивать на веб-страницу документы, видео и интерактивные медиафайлы и прочие части содержимого из других источников.

    //«Headless» - «Безголовая» компьютерная система — это система без локального интерфейса. Там нет монитора («голова»), подключенного к нему. Также нет клавиатуры, мыши, сенсорного экрана или другого локального интерфейса для управления им.
}


