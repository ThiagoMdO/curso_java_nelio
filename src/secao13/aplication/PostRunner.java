package secao13.aplication;

import secao13.model.entity.Comment;
import secao13.model.entity.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PostRunner {
    public static void main(String[] args){

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("WOW that is awesome!");

        String date1 = "22/02/2021 01:30:26";
        LocalDateTime dataC1 = LocalDateTime.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
//        System.out.println(dataC1.format(DateTimeFormatter.ofPattern("eeee dd/MM/yyyy HH:mm:ss"));
        Post p1 = new Post(dataC1, "Travaling tp New Zeland", "Eu vou para Pintadas proximo ano", 12);
        p1.addNewComment(c1);
        p1.addNewComment(c2);
        System.out.println(p1);

        System.out.println();

        Comment c3 = new Comment("Essa viagem foi loka!");
        Comment c4 = new Comment("Eu nunca mais quero ir!");

        String date2 = "14/09/2024 01:30:26";
        LocalDateTime dataC2 = LocalDateTime.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
//        System.out.println(dataC1.format(DateTimeFormatter.ofPattern("eeee dd/MM/yyyy HH:mm:ss"));
        Post p2 = new Post(dataC1, "Travaling to Brazil", "Esqueci meu Iphone", -1);
        p2.addNewComment(c3);
        p2.addNewComment(c4);
        System.out.println(p2);

    }
}
