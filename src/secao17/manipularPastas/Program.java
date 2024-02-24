package secao17.manipularPastas;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        File[] files = path.listFiles(File::isFile);

        System.out.println();
        System.out.println("Folders:");
        for(File folder : folders){
            System.out.println(folder);
        }
        System.out.println();
        System.out.println("Files:");
        for (File file : files){
            System.out.println(file);
        }

        //Criar uma pasta através de um repositório
        boolean success = new File(strPath, "\\TesteJavaPasta").mkdir();
        System.out.println("Directory created sucessfully: " + success);

        scanner.close();
    }
}
