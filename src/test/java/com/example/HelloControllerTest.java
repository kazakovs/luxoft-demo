package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by qtr-ptc-4 on 9/1/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    private HelloController helloController = new HelloController();

    @Test
    public void TestUsd(){

        String input = "usd";
        String result = helloController.hello(input);
        String expected = "1.00";
        Assert.assertEquals(expected, result);

    }

    @Test
    public void TestNotSupported(){

        String input = "pln";
        String result = helloController.hello(input);
        String expected = "not supported";
        Assert.assertEquals(expected, result);

    }

}
