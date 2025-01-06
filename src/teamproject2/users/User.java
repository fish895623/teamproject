package teamproject2.users;

public class User {
    // data members
    private String userId;
    private String userPassword;
    private String userName;
    private String email;
    public final String userLevel = null;

    // constructor
    public User(String userId, String userPassword, String userName, String email) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.email = email;
    }

    // method
    // // log-in
    // public void login() {
    // System.out.println(userName + " is logged in.");
    // }
    //
    // // log-out
    // public void logout() {
    // System.out.println(userName + " is logged out.");
    // }

    // email validation
    public void emailValidator(String email) throws InvalidEmailException {
        // null check and empty check
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidEmailException("Email cannot be null or empty.");
        }

        // regular expression
        String emailRegex =
                "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // email validation
        if (email.matches(emailRegex)) {
            System.out.println("Email is valid.");
        } else {
            throw new InvalidEmailException("Invalid email format.");
        }
    }

    // getters and setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
