package com.bigfish;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void sayHello() {
        Hello hello = new Hello();
        Assert.assertEquals(hello.sayHello(), "hello");
    }
}
