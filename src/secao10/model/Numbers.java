package secao10.model;

import java.util.Arrays;

public class Numbers {

    private final Double[] numers;

    public Numbers(Double[] numers){
        this.numers = numers;
    }

    public Double[] getNumbers(){
        return numers;
    }

    public Double getOnlyNumber(int indic){
        return numers[indic];
    }

    public void setNumers(Double newNumber, int index){
        numers[index] = newNumber;
    }

   public String toString(){
        return Arrays.toString(numers);
    }
}
