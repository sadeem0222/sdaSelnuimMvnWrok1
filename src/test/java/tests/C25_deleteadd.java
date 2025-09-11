package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.testCase;

public class C25_deleteadd extends testCase {
    /*
 Go to https://claruswaysda.github.io/addDeleteStar.html
 Create a method to add given number of stars
 Create a method to delete given numbers of stars
 Create a method to verify the given number of stars deleted
 */

    @Test
    void deleteaddtest() {
        // Go to https://claruswaysda.github.io/addDeleteStar.html
        driver.get("https://claruswaysda.github.io/addDeleteStar.html");


        // Create a method to verify the given number of stars deleted
        int num1=addStar(14);
        int num2=  deletDtar(13);
        int remaining = verifyStars(num1, num2);
        System.out.println("Remaining stars = " + remaining);


    }
        // Create a method to add given number of stars
        int addStar(int num){
            WebElement star= driver.findElement(By.id("push-button"));
            for (int i=0 ; i<num ; i++) {
                star.click();
            }
            return num;
            }

            // Create a method to delete given numbers of stars
            int deletDtar(int num){
                WebElement delet= driver.findElement(By.id("delete-button"));
                for (int i=0 ; i<num ; i++){
                    delet.click();

                }
                return num;

            }


   // Create a method to verify the given number of stars deleted
    int verifyStars(int add, int del){
        return add - del;
    }



}





