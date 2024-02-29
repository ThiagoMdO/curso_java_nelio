package secao19.model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGenerics<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T integer){
        list.add(integer);
    }

    public T first(){
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
