package secao10.model;

public class EstudantesAluguel {

    private String nome;

    private String email;

    public EstudantesAluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newName) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return nome + ", " + email;
    }
}
