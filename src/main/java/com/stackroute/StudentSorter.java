package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAge()>s2.getAge()){
            return 1;
        }
        else if(s1.getAge()<s2.getAge()) return -1;
        else{
            if(s1.getName().compareTo(s2.getName())>0) return 1;
            else if (s1.getName().compareTo(s2.getName())<0) return -1;
            else{
                if(s1.getID()>s2.getID()) return 1;
                else if(s1.getID()<s2.getID()) return -1;
                else return 0;
            }
        }
    }
}
