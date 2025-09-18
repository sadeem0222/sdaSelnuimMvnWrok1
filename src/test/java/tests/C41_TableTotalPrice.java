package tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

import java.util.Arrays;
import java.util.List;

public class C41_TableTotalPrice extends testCase {
    /*
    Go to https://claruswaysda.github.io/webTable.html
    Calculate and assert the total price in Table 2.
    */

    @Test
    void tableTotalPriceTest() {

//        Go to https://claruswaysda.github.io/webTable.html
driver.get("https://claruswaysda.github.io/webTable.html");

//        Calculate and assert the total price in Table 2.
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='t2']/tbody/tr"));

        String[] price = new String[rows.size()];

        int sum = 0;
        for (int i = 0; i < rows.size(); i++) {
            String priceText = rows.get(i).findElement(By.xpath(".//td[3]")).getText();
            sum += Integer.parseInt(priceText.replace("$", ""));
        }

        System.out.println("sum = " + sum);
        Assertions.assertEquals(2275,sum);


    }
}