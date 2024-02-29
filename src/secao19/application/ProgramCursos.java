package secao19.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramCursos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> a = new HashSet<>(2);
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Number for the #%d student: ", i);
            Integer numberStudent = scanner.nextInt();
            a.add(numberStudent);
        }

        System.out.print("How many students for course B? ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Number for the #%d student: ", i);
            Integer numberStudent = scanner.nextInt();
            b.add(numberStudent);
        }

        System.out.print("How many students for course C? ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Number for the #%d student: ", i);
            Integer numberStudent = scanner.nextInt();
            c.add(numberStudent);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
    }
}
