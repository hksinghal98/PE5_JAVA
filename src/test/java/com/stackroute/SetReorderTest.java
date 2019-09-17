package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetReorderTest {
    @After
    public void teardown(){
        SetReorder SR = null;
    }
    @Test
    public void SetReorder_SortTest_AssertEquals()
    {
        SetReorder SR = new SetReorder();
        String[] strArray = new String[]{"asjks","sscsc","sdsacjsc","sbjsc","sbjsc","asjks"};
        String[] outputArray = new String[]{"asjks","sbjsc","sdsacjsc","sscsc"};
        List<String> list = Arrays.asList(outputArray);
        Assert.assertEquals(list,SR.SortSet(strArray));
    }

    @Test
    public void SetReorder_SortTest_AssertNull()
    {
        SetReorder SR = new SetReorder();
        String[] strArray = new String[]{};
        Assert.assertNull(SR.SortSet(strArray));
    }

    @Test
    public void SetReorder_SortTest_AssertNotNull()
    {
        SetReorder SR = new SetReorder();
        String[] strArray = new String[]{"asjks","sscsc","sdsacjsc","sbjsc","sbjsc","asjks"};
        String[] outputArray = new String[]{"asjks","sbjsc","sdsacjsc","sscsc"};
        List<String> list = Arrays.asList(outputArray);
        Assert.assertNotNull(SR.SortSet(strArray));
    }
}
