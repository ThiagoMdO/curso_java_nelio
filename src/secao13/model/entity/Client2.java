package secao13.model.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client2 {

    private String name;

    private String email;

    private LocalDate date;

    public Client2(String name, String email, LocalDate date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate newDate){
        this.date = newDate;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Client: ");
        sb.append(name + " ");
        sb.append("(" + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")");
        sb.append(" - " + email);
        return sb.toString();
    }
}
