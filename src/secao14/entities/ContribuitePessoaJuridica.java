package secao14.entities;

public class ContribuitePessoaJuridica extends Contribuintes{

    private Integer numeroFuncionarios;

    public ContribuitePessoaJuridica(){
        super();
    }

    public ContribuitePessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios){
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto(){
        Double impostoCobrado = 0.16;

        if (numeroFuncionarios > 10) {
            impostoCobrado = 0.14;
        }

        Double impostoTotal = (super.getRendaAnual() * impostoCobrado);

//        super.setRendaAnual(super.getRendaAnual() - (super.getRendaAnual() * impostoCobrado));

        return impostoTotal;
    }
}
