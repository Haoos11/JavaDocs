package com.timnet.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Silviu.Marin on 10-Jul-17.
 */
public class MyUnitTest {
    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenateNulls() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate(null, null);
        assertEquals(null, result);

    }



}
