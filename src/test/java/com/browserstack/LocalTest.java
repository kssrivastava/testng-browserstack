package com.browserstack;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("http://bs-local.com:45691/check");
        System.out.println("This ismy local test!!!");
        System.out.println("This ismy local test111!!!");
        
        Assert.assertTrue(driver.getPageSource().contains("Up and running"));
    }
}
