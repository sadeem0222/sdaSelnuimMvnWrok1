package tests;

import org.junit.jupiter.api.*;

public class C06_junit {
    @BeforeAll
    static void beforeAll(){
        System.out.println("before All");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

    @BeforeEach
     void beforeEach(){
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach");

    }

    @Test
    void test01(){
        System.out.println("test01");

    }

    @Test @Disabled
    void test02(){
        System.out.println("test02");

    }
    @Test
    void test03(){
        System.out.println("test03");

    }
    @Test
    void test04(){
        System.out.println("test04");

    }
    @Test
    void test5(){
        System.out.println("test05");

    }

}
