package teamproject2.users;

public class Admin extends User {
	// field
	private String role;

	// constructor
	public Admin(String userId, String userPassword, String userName, String email) {
		super(userId, userPassword, userName, email);
		
	}
	
	// method
	public void manageDevice() {
	}

	public void manageUser() {
	}


	// getter and setter
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
