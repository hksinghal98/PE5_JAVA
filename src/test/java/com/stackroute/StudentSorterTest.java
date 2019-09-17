package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentSorterTest {
    @After
    public void teardown(){
        Maintest MT = null;
    }
    @Test
    public void SetReorder_SortTest_AssertEquals()
    {
        Student st1 = new Student(1, 20, "ABC");
        Student st2 = new Student(2, 20, "ABC");
        Student st3 = new Student(3, 21, "ASD");
        Student st4 = new Student(4, 19, "QWE");
        Student st5 = new Student(5, 25, "ZXC");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        ArrayList<Student> list1 = new ArrayList<Student>();
        list1.add(st4);
        list.add(st2);
        list.add(st1);
        list.add(st3);
        list.add(st4);
        Maintest MT = new Maintest();
        Assert.assertEquals(list,MT.SortedList(list));
    }

    @Test
    public void SetReorder_SortTest_AssertNull()
    {
        ArrayList<Student> list = new ArrayList<Student>();
        Maintest MT = new Maintest();
        Assert.assertNull(null,MT.SortedList(list));
    }
}
