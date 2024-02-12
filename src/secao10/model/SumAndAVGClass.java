package secao10.model;

public class SumAndAVGClass {

    private Double[] numbers;


    public SumAndAVGClass(Double[] numbers){
        this.numbers = numbers;
    }

    public Double[] getNumbers(){
        return numbers;
    }

    public Double getOnlyNumber(int index){
        return numbers[index];
    }

    public void setNumbers(Double newNumbers, int index) {
        this.numbers[index] = newNumbers;
    }
}
