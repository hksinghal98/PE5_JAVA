package com.stackroute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordsFrequency {
    private String InputString;
    public void setString(String InputString){
        this.InputString = InputString;
    }

    public String CountFrequency(){
        List<String> list =new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String[] words = this.InputString.split("[^a-zA-Z]+");
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])) map.put(words[i],map.get(words[i])+1);
            else map.put(words[i],1);
            System.out.println(map);
        }
        return map.toString();
    }
}
