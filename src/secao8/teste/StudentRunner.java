package secao8.teste;

import secao8.model.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentRunner {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter with student notes");
        System.out.print("Name: ");
        student.name = scanner.nextLine();
        System.out.print("First note period: ");
        double firstNote = scanner.nextDouble();

        System.out.print("Second note period: ");
        double secondNote = scanner.nextDouble();

        System.out.print("Third note period: ");
        double thirdNote = scanner.nextDouble();

        student.situationStudent(firstNote, secondNote, thirdNote);

        System.out.println(student);
    }
}
