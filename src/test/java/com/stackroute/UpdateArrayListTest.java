package com.stackroute;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateArrayListTest {
    /**
     * Rigorous Test :-)
     */

    @After
    public void teardown(){
        UpdateArrayList UAL = null;
    }
    @Test
    public void UpdateArrayList_AddArrayList_AssertEquals()
    {
        String[] str = new String[]{"Apple", "Grape","Lemon","Berry"};
        UpdateArrayList UAL = new UpdateArrayList(str);
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(str));
        Assert.assertEquals(list,UAL.addElementToArrayList());
    }

    @Test
    public void UpdateArrayList_EmptyArrayList_AssertEquals()
    {
        UpdateArrayList UAL = new UpdateArrayList(new String[]{"Apple","Grape","Lemon","Berry"});
        List<String> list = new ArrayList<String>();
        list.add("Kiwi");
        list.add("Grape");
        list.add("Mango");
        list.add("Berry");
        Assert.assertEquals(list,UAL.DeleteElementToArrayList(new String[]{"Apple","Lemon"}, new String[]{"Kiwi","Mango"}));
        Assert.assertEquals("List Cleared",UAL.EmptyArrayList());
    }
    @Test
    public void UpdateArrayList_DeleteElementArrayList_AssertNotEquals()
    {
        UpdateArrayList UAL = new UpdateArrayList(new String[]{"Apple","Grape","Lemon","Berry"});
        List<String> list = new ArrayList<String>();
        list.add("Kiwi");
        list.add("Grape");
        list.add("Mango");
        Assert.assertNotEquals(list,UAL.DeleteElementToArrayList(new String[]{"Apple","Lemon"}, new String[]{"Kiwi","Mango"}));
    }

    @Test
    public void UpdateArrayList_DeleteElementArrayList_AssertNull()
    {
        UpdateArrayList UAL = new UpdateArrayList(new String[]{"Apple","Grape","Lemon","Berry"});
        List<String> list = new ArrayList<String>();
        list.add("Kiwi");
        list.add("Grape");
        list.add("Mango");
        list.add("Berry");
        Assert.assertNull(UAL.DeleteElementToArrayList(new String[]{"Apple","Lemon"}, new String[]{"Kiwi"}));
    }

}
