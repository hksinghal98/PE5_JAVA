package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CountStringsTest {
    @After
    public void teardown(){
        CountStrings CS = null;
    }
    @Test
    public void CountWordsFrequency_CountFrequency_AssertEquals()
    {
        CountStrings CS = new CountStrings();
        String[] strArray = new String[]{"a","b","c","d","a","c","c"};
        CS.setStringArray(strArray);
        Assert.assertEquals("{a=true, b=false, c=true, d=false}",CS.CountFrequency());
    }

    @Test
    public void CountWordsFrequency_CountFrequency_AssertNotEquals()
    {
        CountStrings CS = new CountStrings();
        String[] strArray = new String[]{"a","b","c","d","a","c","c"};
        CS.setStringArray(strArray);
        Assert.assertNotEquals("{a=true, b=true, c=true, d=false}",CS.CountFrequency());
    }
    @Test
    public void CountWordsFrequency_CountFrequency_AssertNull()
    {
        CountStrings CS = new CountStrings();
        String[] strArray = new String[]{};
        CS.setStringArray(strArray);
        Assert.assertNull(CS.CountFrequency());
    }
}
