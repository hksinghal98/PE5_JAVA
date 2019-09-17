package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountWordsFrequencyTest {
    /**
     * Rigorous Test :-)
     */

    @After
    public void teardown(){
        CountWordsFrequency CWF = null;
    }
    @Test
    public void CountWordsFrequency_CountFrequency_AssertEquals()
    {
        CountWordsFrequency CWF = new CountWordsFrequency();
        CWF.setString("one one -one___two,,three,one @three*one?two");
        Assert.assertEquals("{one=5, two=2, three=2}",CWF.CountFrequency());
    }

    @Test
    public void CountWordsFrequency_CountFrequency_AssertNotNull()
    {
        CountWordsFrequency CWF = new CountWordsFrequency();
        CWF.setString("one one -one___two,,three,one @three*one?two");
        Assert.assertNotNull(CWF.CountFrequency());
    }

    @Test
    public void CountWordsFrequency_CountFrequency_AssertnotEquals()
    {
        CountWordsFrequency CWF = new CountWordsFrequency();
        CWF.setString("one one -one___two,,three,one @three*one?two");
        Assert.assertNotEquals("{one=4, two=2, three=2}",CWF.CountFrequency());
    }

}
