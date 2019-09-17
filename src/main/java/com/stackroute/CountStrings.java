package com.stackroute;

import java.util.*;

public class CountStrings {
    private String[] InputStringArray;
    public void setStringArray(String[] InputStringArray){
        this.InputStringArray = InputStringArray;
    }

    public String CountFrequency(){
        if(this.InputStringArray.length == 0) return null;
        List<String> list =new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<this.InputStringArray.length;i++){
            if(map.containsKey(this.InputStringArray[i])) map.put(this.InputStringArray[i],map.get(this.InputStringArray[i])+1);
            else map.put(this.InputStringArray[i],1);
        }

        HashMap<String, Boolean> OutputMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
                if(entry.getValue() >= 2) OutputMap.put(entry.getKey(), Boolean.TRUE);
                else OutputMap.put(entry.getKey(), Boolean.FALSE);
        }
        System.out.println(OutputMap.toString());
        return OutputMap.toString();
    }
}
