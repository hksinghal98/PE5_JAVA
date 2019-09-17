package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class UpdateArrayList {
    private List<String> list = new ArrayList<>();

    public UpdateArrayList(String[] DefaultElementArray){
        this.list.addAll(Arrays.asList(DefaultElementArray));
    }

    public List<String> addElementToArrayList(){
        return this.list;
    }

    public List<String> DeleteElementToArrayList(String[] DeleteElementArray, String[] newElementArray){
        if(DeleteElementArray.length != newElementArray.length) return null;
        for(int i=0;i<DeleteElementArray.length;i++){
            ListIterator<String> it = this.list.listIterator();
            while (it.hasNext()) {
                if (it.next().equals(DeleteElementArray[i])) {
                    it.set(newElementArray[i]);
                }
            }
        }
        return this.list;
    }

    public String EmptyArrayList(){
        this.list.retainAll(this.list);
        System.out.println(this.list);
        return "List Cleared";
    }

}
