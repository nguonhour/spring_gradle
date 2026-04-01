package test.example.requestXresponse;

public class LoginResponse {
    // private String token;
    // private String refreshToken;

    private String email;
    private String password;

    public LoginResponse(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginResponse() {
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // public LoginResponse(String token, String refreshToken) {
    //     this.token = token;
    //     this.refreshToken = refreshToken;
    // }

    // public String getToken() {
    //     return token;
    // }

    // public void setToken(String token) {
    //     this.token = token;
    // }

    // public String getRefreshToken() {
    //     return refreshToken;
    // }

    // public void setRefreshToken(String refreshToken) {
    //     this.refreshToken = refreshToken;
    // }

}
