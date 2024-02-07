package secao8.model;

import java.sql.SQLOutput;

public class Student {

    public String name;

    public void situationStudent(Double note1, Double note2, Double note3){
        if(note1.isNaN() || note1.toString().isBlank() || note1 < 0 || note1 > 30){
            System.out.println("The first note is wrong, please enter with valid data");
            return;
        }
        if(note2.isNaN() || note2.toString().isBlank() || note2 < 0 || note2 > 35){
            System.out.println("The second note is wrong, please enter with valid data");
            return;
        }
        if(note3.isNaN() || note3.toString().isBlank() || note3 < 0 || note3 > 30){
            System.out.println("The thirst note is wrong, please enter with valid data");
            return;
        }

        double soma = note1 + note2 + note3;

        if(soma < 60){
            System.out.println("FINAL GRADE = " + soma + "\n"
                                + "FAILED \n"
                                + "MISSING " + (60 - soma) + " POINTS");
        }else{
            System.out.println("FINAL GRADE = " + soma + "\n"
                                + "PASS");
        }


    }
}
