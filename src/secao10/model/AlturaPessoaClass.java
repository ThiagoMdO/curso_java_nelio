package secao10.model;

public class AlturaPessoaClass {

    private String[] nome;

    private int[] idade;

    private double[] altura;


    public AlturaPessoaClass(String[] nome, int[] idade, double[] altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String[] getNome(){
        return nome;
    }

    public String getNomeForIndex(int index){
        return nome[index];
    }

    public void setNome(String newName, int index){
        this.nome[index] = newName;
    }

    public int[] getIdade(){
        return idade;
    }

    public int getIdadeForIndex(int index){
        return idade[index];
    }
    public void setIdade(int newIdade, int index){
        this.idade[index] = newIdade;
    }

    public double[] getAltura(){
        return altura;
    }

    public double getAlturaForIndex(int index){
        return altura[index];
    }

    public void setAltura(double newAltura, int index){
        this.altura[index] = newAltura;
    }

    public String toString(int index){
        return nome[index];
    }



}
