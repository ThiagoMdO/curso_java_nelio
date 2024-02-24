package secao17.fileReadAndBufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PromgramRead {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\teste01.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    br.close();
                }
            }catch (IOException e){
//                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
