package teamproject2.users;

public class User {

	private String userId;
	private String userPassword;
	private String userName;
	private String email;
	
	public User(String userId, String userPassword, String userName, String email) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.email = email;
	}
	
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
