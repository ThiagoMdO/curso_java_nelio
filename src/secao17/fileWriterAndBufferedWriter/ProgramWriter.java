package secao17.fileWriterAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriter {

    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String[] lines2 = new String[]{"Bom dia", "Boa tarde", "Boa Noite"};

        String path = "C:\\Users\\User\\Desktop\\teste02.txt";
        String path2 = "C:\\Users\\User\\Desktop\\teste03.txt";

        //Criar ou sobrescrever arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        //Cria novo ou Adiciona mais conteudo no arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2,true))) {
            for (String line: lines2){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
