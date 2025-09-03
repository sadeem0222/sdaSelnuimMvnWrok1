package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class C07_assertion {
String name="k";

    @Test
    void assertEqualsTest(){
        String actualData = "jhon";
        String expectedlData = "jhon";
        Assertions.assertEquals(expectedlData,actualData,"not equal");

    }
    @Test
    void asserTrueTest(){
        String table = "wolf";
        Assertions.assertTrue(table.contains("wolf"),"dose not contain the table");
    }

    @Test
    void asserTrFalseTest(){
        String table = "wolf";
        Assertions.assertFalse(table.contains("jhon"),"dose not contain the table");
    }
    @Test
    void assertNullTest(){
        System.out.println("name is ="+ name);
        assertNull(name,"name is not null");
    }


}
