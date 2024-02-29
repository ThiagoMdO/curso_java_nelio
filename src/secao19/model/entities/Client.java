package secao19.model.entities;

import java.util.Objects;

public class Client {

    private String name;

    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    //    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + (((name == null) ? 0 : name.hashCode()));
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null) return false;
//        Client other = (Client) obj;
//        if (name == null){
//            if (other.name != null)
//                return false;
//        }else if (!name.equals(other.name))
//            return false;
//        return true;
//    }
}
