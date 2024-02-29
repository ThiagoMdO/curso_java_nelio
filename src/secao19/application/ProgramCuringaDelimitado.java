package secao19.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramCuringaDelimitado {
    public static void main(String[] args) {

        //Princípio get/put - covariância
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(14);

        //Number é uma class do tipo Wrapper e super class de outras classes como Integer, Byte, Long, Short, Float e Double
        List<? extends Number> list = intList;

        Number x = list.get(0);
        System.out.println(x);

        //Não é possivel adcionar um valor na lista
//        list.add(23);

        //no caso do tipo curinga (?) é possivel acessar os elemento da lista através do .get() porem não é possivel adicionar outros elementos
            // , chamado de covariancia


/* --------------------------------------------------------------------------------------------------- */
/* --------------------------------------------------------------------------------------------------- */


        //Principio get/put - contravariância
        List<Object> myObjects = new ArrayList<>();
        myObjects.add("Maria");
        myObjects.add("Jonas");

        List<? super Number> myNumbers = myObjects;

        myNumbers.add(10.2);
        myNumbers.add(14);

        //Não é possivel acessar o elemento na lista
//        Number y = myNumbers.get(0);

    }
}
