package _22_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XMLDataProvider {//анотация DataProvider

    @DataProvider(name = "Login data")//вызывали анотацию и в скобках дали ему название
    public Object[][] dpMethod() {//передаем любой объект + название метода
        return new Object[][]{
                {"email", "password"},//кейсы
                {"email2", "password2"},
                {"john@gmail.com", "Bishkek2020"}
        };
    }


    @Test(dataProvider = "Login data")//имя дата провайдера
    public void myTest(String mail, String password) {
        System.out.println("Passed Parameter is : " + mail + " " + password);
    }


                     // TestNG XML - позволяет запускать разом все классы.
    //command + optional + l --> упорядочивает
    //правая кнопка мыши и run
    //<suite name - это название теста
    // <suite name="Regression Test Suite" verbose="1" parallel="classes" thread-count="2">     - многопаточность число 2 значит сколько мы хотим запускать паралельно


}

