package teamproject2.users;

public class Admin extends User {
	// field
	private int role; // 0. device manager, 1. user manager

	// constructor
	public Admin(String userId, String userPassword, String userName, String email) throws InvalidEmailException {
		super(userId, userPassword, userName, email, true);
		this.role = 0;
	}

	// method
	public void manageDevice() {
		if (role == 0) {
			System.out.println("Device manager approved.");
		} else {
			System.out.println("You can not access to this job.");
		}
	}

	public void manageUser() {
		if (role == 1) {
			System.out.println("User manager approved.");
		} else {
			System.out.println("You can not access to this job.");
		}
	}

	// getter and setter
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
}
