package entity;

public class UserEntity {
    private String name;
    private  String username, password;

    public UserEntity(String name, String username, String password){
        this.name=name;
        this.password=password;
        this.username=username;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
