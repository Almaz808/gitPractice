package _24_Selenium;

public class _7_SeleniumExceptions {
//                           Most Common Selenium Exceptions (исключения):
//     1.NoSuchWindowException - возникает, если текущий список окон не обновляется. Предыдущее окно не существует, и вы не можете переключиться на него.
//       Чтобы обработать это исключение, используйте методы веб-драйвера, называемые «driver.getWindowHandles()».
//
//     2.NoSuchFrameException - возникает, когда переключение между несколькими кадрами невозможно.
//       Решение, используемое для обработки NoSuchWindowException, должно идеально работать и для этого исключения.
//
//     3.NoSuchElementException - Происходит, когда локаторы не могут найти или получить доступ к элементам на веб-странице. Исключение возникает из-за использования неправильных локаторов элементов в методе findElement(By, by).
//       Чтобы обработать это исключение, используйте команду ожидания. Используйте Try/Catch, чтобы убедиться, что поток программы прерывается, если команда ожидания не помогает.
//
//     4.NoAlertPresentException - тест выполняется слишком быстро и пытается найти оповещение, которое еще не было открыто браузером.
//       Чтобы обработать или просто избежать этого исключения, используйте явное или плавное ожидание во всех событиях, где ожидается предупреждение.
//
//     5.InvalidSelectorException - Это исключение возникает из-за неправильного селектора. Чаще всего синтаксис селектора неверен.
//       Чтобы избежать этого исключения, сначала проверьте синтаксис локатора. Если он неверен, убедитесь, что локатор синтаксически корректен.
//
//     6.TimeoutException - Это исключение возникает, если команда не была выполнена или завершена в течение времени ожидания.
//       Избежать этого исключения просто. Все, что нужно сделать, это рассчитать среднее время загрузки страницы и соответствующим образом скорректировать время ожидания.

//     7.ElementNotVisibleException - Это исключение возникает, когда WebDriver пытается найти скрытый или невидимый элемент.
//       Для обработки этого исключения важно определить точную причину, которая может быть связана с вложенными веб-элементами или перекрывающимися веб-элементами.

//     8.ElementNotSelectableException -  В таких исключениях элемент присутствует на веб-странице, но его нельзя выбрать.
//       Для обработки этого исключения необходимо использовать команду ожидания.

//     9.NoSuchSessionException - исключение выдается, если метод вызывается после закрытия браузера. Другие причины этого исключения включают сбой браузера.
//       Чтобы избежать этого дескриптора, убедитесь, что ваш браузер обновлен и стабилен.

//    10.StaleElementReferenceException - Это исключение возникает, когда веб-элемент больше не является частью веб-страницы.
//       Чтобы обработать это исключение, вы можете либо использовать Dynamic Xpath для обработки операций DOM

    }

