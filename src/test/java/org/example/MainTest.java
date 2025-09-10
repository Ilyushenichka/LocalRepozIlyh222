package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class MainTest {
    @Test
    public void test() {
        Assert.assertTrue(true);
    }

    @Test
    public void test1() {
        Assert.assertFalse(false);
    }

    @org.junit.Test
    public void test2() {
        Assert.assertTrue(true);
    }

}
