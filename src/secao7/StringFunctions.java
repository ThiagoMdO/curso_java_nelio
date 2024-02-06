package secao7;

public class StringFunctions {

    public static void main(String[] args) {

        String original = "   afadsf FGGFDGDF dasdasd gvcb   ";

        String frase = "Era uma vez uma frase de teste";
        String[] vect = frase.split(" ");
        String word1 = vect[0];

        System.out.println("Original -" + original.toLowerCase() + "-");
        System.out.println("segunda -" + original.toUpperCase() + "-");
        System.out.println("Terceira -" + original.trim() + "-");
        System.out.println("quarto -" + original.substring(9) + "-");
        System.out.println("quarto -" + original.substring(9,19) + "-");
        System.out.println("quarto -" + original.substring(9,16).trim() + "-");
        System.out.println("quinto -" + original.replace("das","NEW "));
        System.out.println("quinto -" + original.replace(" ","*")+"-");

        System.out.println("sexto -" + original.indexOf("das"));
        System.out.println("setimo -" + original.lastIndexOf("das"));


        System.out.println("oitavo -" + word1);
        System.out.println("oitavo -" + vect);
    }
}
