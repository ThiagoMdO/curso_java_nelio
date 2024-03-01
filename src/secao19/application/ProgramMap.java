package secao19.application;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("name", "Eduardo");
        cookies.put("email", "edu@gmail.com");
        cookies.put("phone", "324234542");

        cookies.remove("email");
        System.out.println(cookies);

        cookies.put("phone", "44311111");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Contains 'email' key: " + cookies.containsKey("email"));

        System.out.println("Phone Number: " + cookies.get("phone"));

        System.out.println("Email: " + cookies.get("email"));

        System.out.println("Size: " + cookies.size());

        System.out.println();
        System.out.println("All cookies:");
        for (String key : cookies.keySet()){
            System.out.println(key + " : " + cookies.get(key));
        }
    }
}
