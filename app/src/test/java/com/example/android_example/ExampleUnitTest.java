package com.example.android_example;

import org.junit.Test;

import org.junit.Assert;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test_TestMe(){
        Assert.assertNotNull(new TestMe().test());
    }
}
