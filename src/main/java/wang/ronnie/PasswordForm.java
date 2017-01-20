package wang.ronnie;

import org.hibernate.validator.constraints.NotBlank;

@SamePasswords
public class PasswordForm {

    @NotBlank
    private String password;

    @NotBlank
    private String confirmedPassword;

    // getters and setters omitted for redability


    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getConfirmedPassword() {

        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {

        this.confirmedPassword = confirmedPassword;
    }
}