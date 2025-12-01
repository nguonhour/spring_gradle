package test.example.requestXresponse;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class RegisterRequest {
    @NotNull(message = "Please input username")
    @NotEmpty(message = "Username cannot be empty")
    private String username;

    @NotNull(message = "Please input password")
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    @NotNull(message = "Please input email")
    @NotEmpty(message = "Email cannot be empty")
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}