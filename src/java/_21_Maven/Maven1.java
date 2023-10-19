package _21_Maven;

import com.github.javafaker.Faker;

public class Maven1 {//Maven - подключение номых библиотек. MavenRepository - сайт с библиотеками maven
    //готоввыые библиотеки maven импартируем в poom.xml и обновляем чтобы он заработал
    //poom.xml -Project Object Model. Это модель проекта - в ней описано из чего проект состоит и как устроен его жизненный цикл.

    //Maven live cycles:
    //1.Проверка(validate) - Фреймворк проверяет, корректен ли проект и предоставлена ли вся необходимая для сборки информация.
    //2.Компиляция(compile) - Maven компилирует исходники проекта.
    //3.Тест - Проверка скомпилированных файлов. В нашем случае будет использована библиотека JUnit.
    //4.Сборка проекта(package) - По умолчанию осуществляется в формате JAR. Этот параметр можно изменить, добавивв в project тег packaging.
    //5.Верификация - Артефакт проверяется на соответствие критериям качества.
    //6.Инсталляция - Артефакт попадает в локальный репозиторий. Теперь его можно использовать в качестве зависимости.
    //7.Размещение проекта в удаленном репазитории - deploy, - финальная стадия работы.

    //mvn --version  -версия джава
    //mvn clean      -удаляет target(старые данные), он появляется после запуска программы
    // Этот код дает нам рандомные данные(имена,фамилии итд)с библиотеки maven
    static Faker faker = new Faker();

    public static void main(String[] args) {

        System.out.println("Fake Name is : " + generateFakeName());
        System.out.println("Fake LastName is : " + generateFakeLastName());
        System.out.println("Fake EmailAddress is :" + generateFakeEmailAddress());
        System.out.println("Chuck Norris says : " + generateFunnyWord());


    }


    public static String generateFakeName(){
        return faker.name().firstName();//методы с библиотеки, выдвют рандомные данные со сввоего списка(таких много)
    }

    public static String generateFakeLastName(){
        return faker.name().firstName();//методы с библиотеки
    }

    public static String generateFakeEmailAddress(){
        return faker.internet().emailAddress();//методы с библиотеки
    }

    public static String generateFunnyWord(){
        return faker.chuckNorris().fact();//методы с библиотеки
    }

}
