package tests;

import org.junit.jupiter.api.Test;
import utilites.JSUtils;
import utilites.testCase;

public class C30_scroldown extends testCase {
    @Test
    void scroltest() throws InterruptedException {
        driver.get("https://testpages.eviltester.com/styled/index.html");
        Thread.sleep(3000);
        JSUtils.scrollDownByPx(driver,500);
        Thread.sleep(3000);
        JSUtils.scrollDownByPx(driver,100);

    }
}
