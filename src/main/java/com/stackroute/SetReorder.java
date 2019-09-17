package com.stackroute;

import java.util.*;

public class SetReorder {
    public ArrayList SortSet(String[] InputArray){
        if(InputArray.length==0) return null;
        List<String> list = Arrays.asList(InputArray);
        Set<String> set = new TreeSet<String>(list);
        int n = set.size();
        ArrayList<String> aList = new ArrayList<String>(n);
        for (String x : set){
            aList.add(x);
        }
        return aList;
    }
}
