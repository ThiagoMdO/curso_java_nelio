package secao19.model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintServiceObject {

    private List<Object> list = new ArrayList<>();

    public void addValue(Object integer){
        list.add(integer);
    }

    public Object first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.toArray().length; i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
