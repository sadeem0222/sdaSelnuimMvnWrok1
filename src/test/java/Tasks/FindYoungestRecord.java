package Tasks;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilites.testCase;

import java.util.Arrays;
import java.util.List;

public class FindYoungestRecord extends testCase {
     /*
 Go to https://claruswaysda.github.io/addRecordWebTable.html
 Add 10 records using Faker.
 Find the name of the youngest record.
 */

    @Test
    void youngesttest(){
//        Go to https://claruswaysda.github.io/addRecordWebTable.html
        driver.get("https://claruswaysda.github.io/addRecordWebTable.html");
//        Add 10 records using Faker.

        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            driver.findElement(By.id("nameInput")).sendKeys(faker.name().fullName());
            driver.findElement(By.id("ageInput")).sendKeys(faker.number().numberBetween(18, 80) + "");
            Select select = new Select(driver.findElement(By.id("countrySelect")));
            select.selectByIndex(faker.number().numberBetween(1, 5));

            driver.findElement(By.xpath("//button[@onclick='addRecord()']")).click();

        }
//                Find the name of the youngest record.
        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));

        String[] ages = new String[rows.size()];

        for (int i = 0; i < rows.size(); i++) {

            ages[i] = rows.get(i).findElement(By.xpath(".//td[2]")).getText();
        }
        System.out.println("ages = " + Arrays.toString(ages));
        int minAge = Arrays.stream(ages)
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt();

        System.out.println("Youngest age = " + minAge);


    }
}
