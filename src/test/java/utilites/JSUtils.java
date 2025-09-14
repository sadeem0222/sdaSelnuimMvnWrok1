package utilites;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtils {

    public static void flash(WebElement element, WebDriver driver, String color) {


        String originalColor = element.getCssValue("backgroundColor");

        for (int i = 0; i < 10; i++) {
            changebackgroundColor(driver,element,color);
            changebackgroundColor(driver, element, originalColor);
        }
    }

    public static void changebackgroundColor(WebDriver driver, WebElement element, String color) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor ='" + color + "'", element);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void chnagebroder(WebDriver driver,WebElement element, String px, String style,String color ){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].style.border='"+px+" "+style+" "+color+"'", element);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        js.executeScript("arguments[0].style.border='0px solid red'", element);


    }
    public static void remove(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='none'", element);

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static void flash(WebDriver driver,WebElement element,String px, String style,String color){

        for (int i = 0; i < 10; i++) {
            chnagebroder(driver,element,px,style,color);
            remove(driver, element);

        }


    }

    public static void scrollDownByPx(WebDriver driver, int px) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + px + ");");
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