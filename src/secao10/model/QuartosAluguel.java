package secao10.model;

public class QuartosAluguel {

    private EstudantesAluguel dadosEstudante;

    private int room;

    public QuartosAluguel(EstudantesAluguel dadosEstudante, int room){
        this.dadosEstudante = dadosEstudante;
        this.room = room;
    }

    public EstudantesAluguel getDadosEstudante(){
        return dadosEstudante;
    }

    public void setDadosEstudante(EstudantesAluguel dadosEstudante){
        this.dadosEstudante = dadosEstudante;
    }

    public int getRoom(){
        return room;
    }

    public void setRoom(int room){
        this.room = room;
    }

    public String toString(){
        return room + ": " + dadosEstudante.toString();
    }


}
