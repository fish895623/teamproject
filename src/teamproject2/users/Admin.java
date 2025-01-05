package teamproject2.users;

public class Admin extends User {
	private String role;

	public Admin(String userId, String userPassword, String userName, String email) {
		super(userId, userPassword, userName, email);
		// TODO Auto-generated constructor stub
	}

	public void manageDevice() {
	}

	public void manageUsers() {
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
