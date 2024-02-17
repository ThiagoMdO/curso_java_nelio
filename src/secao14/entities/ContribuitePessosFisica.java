package secao14.entities;

public class ContribuitePessosFisica extends Contribuintes {

    private Double gastosSaude;

    public ContribuitePessosFisica() {
        super();
    }

    public ContribuitePessosFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        Double impostoCobrado = 0.0;
        Double descontoSaude = 1.0;

        if (super.getRendaAnual() < 20000.00) {
            impostoCobrado = 0.15;
        }
        if (super.getRendaAnual() >= 20000.00) {
            impostoCobrado = 0.25;
        }
        if (gastosSaude > 0) {
            descontoSaude = 0.5;
        }

        Double impotoTotal = (super.getRendaAnual() * impostoCobrado) - (gastosSaude * descontoSaude);

//        super.setRendaAnual((super.getRendaAnual() - (super.getRendaAnual() * impostoCobrado)) - (gastosSaude * descontoSaude));

        return impotoTotal;
    }
}
