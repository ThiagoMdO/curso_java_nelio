package secao13.model.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private LocalDateTime moment;

    private String title;

    private String content;

    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){
    }
    public Post(LocalDateTime moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment(){
        return moment;
    }

    public void setMoment(LocalDateTime newMoment){
        this.moment = newMoment;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String newContent){
        this.content = newContent;
    }

    public Integer getLikes(){
        return likes;
    }

    public void setLikes(Integer newLikes){
        this.likes = likes;
    }

    public void addNewComment(Comment addNewComment){
        this.comments.add(addNewComment);
    }

    public void removeComment(Comment removeComment){
        this.comments.remove(removeComment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");

        for(Comment c : comments){
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }



}
