package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class SwapKeyValueTest {
    @After
    public void teardown(){
       SwapKeyValue SKV = null;
    }
    @Test
    public void SwapKeyvalue_swapvalue_AssertEquals()
    {
        SwapKeyValue SKV = new SwapKeyValue();
        HashMap<String,String> map = new HashMap<>();
        map.put("FirstName","himanshu");
        map.put("LastName","Singhal");
        Assert.assertEquals("{val2=himanshu, val1=}",SKV.swapvalue(map));
    }

    @Test
    public void SwapKeyValue_swapvalue_AssertNull()
    {
        SwapKeyValue SKV = new SwapKeyValue();
        HashMap<String,String> map = new HashMap<>();
        Assert.assertNull(SKV.swapvalue(map));
    }

    @Test
    public void SwapKeyValue_swapvalue_AssertNotNull()
    {
        SwapKeyValue SKV = new SwapKeyValue();
        HashMap<String,String> map = new HashMap<>();
        map.put("FirstName","himanshu");
        map.put("LastName","Singhal");
        Assert.assertNotNull(SKV.swapvalue(map));
    }

}
