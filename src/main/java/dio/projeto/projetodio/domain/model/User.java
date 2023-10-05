package dio.projeto.projetodio.domain.model;

import java.util.List;

public class User {
    private String user;
    private Account account;
    private List<Pet> pets;


     // getters and setters

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    

}
