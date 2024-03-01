package secao19.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramEleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> votes = new HashMap<>();

        System.out.println("Enter file full path");
        // C:\Users\User\Desktop\Uniasselvi\votos.txt
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                Integer count = Integer.parseInt(fields[1]);

                if(votes.containsKey(name)){
                    Integer votesSoFar = count;
                    votes.put(name, votesSoFar + votes.get(name));
                }else{
                    votes.put(name, count);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()){
                System.out.println(key + " : " + votes.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }

    }
}
