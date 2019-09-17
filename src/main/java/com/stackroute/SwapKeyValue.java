package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class SwapKeyValue {
    public String swapvalue(HashMap<String,String> map){
        if(map.isEmpty()) return null;
        String[] values = new String[2];
        Map.Entry<String,String> entry = map.entrySet().iterator().next();
        values[0] = entry.getValue();
        map.clear();
        map.put("val1","");
        map.put("val2",values[0]);
        return map.toString();
    }
}
