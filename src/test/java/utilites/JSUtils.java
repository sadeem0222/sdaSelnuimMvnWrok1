package utilites;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtils {

    public static void flash(WebElement element, WebDriver driver, String color) {


        String originalColor = element.getCssValue("backgroundColor");

        for (int i = 0; i < 10; i++) {
            changeColor(driver,element,color);
            changeColor(driver, element, originalColor);
        }
    }

    public static void changeColor(WebDriver driver, WebElement element, String color) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor ='" + color + "'", element);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    // يغير قيمة العنصر (مثل input أو select)
    public static void setValue(WebDriver driver, WebElement element, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + value + "';", element);
    }
    public static void clickElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }


}