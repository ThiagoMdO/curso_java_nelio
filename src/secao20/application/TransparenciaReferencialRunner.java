package secao20.application;

import java.util.Arrays;

public class TransparenciaReferencialRunner {
    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[] {3,4,5};

        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));

        Integer sum = Arrays.stream(vect).reduce(0,Integer::sum);
        System.out.println(sum);
    }

    public static void changeOddValues(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] %2 != 0){
                numbers[i] += globalValue;
            }
        }
    }
}
