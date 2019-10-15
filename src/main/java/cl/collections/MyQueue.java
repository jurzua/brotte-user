package cl.collections;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> list;

    public MyQueue() {
        this.list = new ArrayList<Integer>();
    }

    public boolean add(Integer value){
        this.list.add(value);
        return true;
    }

    public Integer peek(){
        // 2, 5, 8, 1
        // size = 4
        if(list.isEmpty()){
            return null;
        }
        return list.get(list.size()-1);
    }

    public Integer pool(){
        if(list.isEmpty()){
            return null;
        }
        Integer value = list.get(list.size()-1);
        list.remove((list.size()-1));
        return value;
    }


}
