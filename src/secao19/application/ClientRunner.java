package secao19.application;

import secao19.model.entities.Client;

public class ClientRunner {
    public static void main(String[] args) {
        Client c1 = new Client("Arlindo", "arli@gmaoç.com");
        Client c2 = new Client("Arlindo", "arli@gmaoç.com");

        String resultado = (c1.equals(c2)) ? "São igual" : "São diferentes";

        System.out.println(resultado);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }
}
