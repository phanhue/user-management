package usermanagement.demo.dto;

public class UserDTO {
    private Long id;
    private String username;
    private String fullname;
    private  String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                ", username='" + username + '\'' +
                ", fullname='" + fullname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
