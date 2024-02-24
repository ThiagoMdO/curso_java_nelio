package secao17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        File file = new File("C:\\Users\\User\\Desktop\\teste021.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("404: arquivo não encontrado");
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }
}
