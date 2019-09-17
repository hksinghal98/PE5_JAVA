package com.stackroute;

import java.util.*;

public class Maintest {
    public ArrayList<Student> SortedList(ArrayList<Student>list) {
        if(list.isEmpty()) return null;
        Collections.sort(list, new StudentSorter());
        Iterator itr2 = list.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
        }

        return list;
    }
}


