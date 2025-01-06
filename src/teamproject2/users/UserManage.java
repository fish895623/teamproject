package teamproject2.users;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class UserManage {
	// data members
	private List<Map<String, User>> userList;



	// constructor
	public UserManage() {
		this.userList = new ArrayList<>(); // initiate
	}

	// methods
	// add user
	public void addUser(String userId, String userPassword, String userName, String email) {
		User newUser = new User(userId, userPassword, userName, email);
		if (userList.isEmpty()) {
			Map<String, User> userGroup = new HashMap<>();
			userGroup.put(userId, newUser);
			userList.add(userGroup);
		} else {
			Map<String, User> userGroup = userList.get(userList.size() - 1);
			userGroup.put(userId, newUser);
		}

		System.out.println("User " + userName + " added successfully.");
	}

	// delete user
	public void deleteUser(String userId) {
		boolean userFound = false;

		for (Map<String, User> userGroup : userList) {
			if (userGroup.containsKey(userId)) {
				userGroup.remove(userId);
				userFound = true;
				System.out.println("User " + userId + " deleted successfully.");
				return;
			}
		}

		if (!userFound) {
			System.out.println("User with ID " + userId + " not found.");
		}
	}

	// edit password
	public void modifyUser(String userId, String userPassword, String newPassword) {
		boolean userFound = false;

		for (Map<String, User> userGroup : userList) {
			if (userGroup.containsKey(userId)) {
				User user = userGroup.get(userId);
				// check current password corresponding
				if (user.getUserPassword().equals(userPassword)) {
					user.setUserPassword(newPassword);
					userFound = true;
					System.out.println("User " + userId + "'s password updated successfully.");
					return;
				} else {
					System.out.println("Incorrect current password for user " + userId + ".");
					return;
				}
			}
		}
		if (!userFound) {
			System.out.println("User with ID " + userId + " not found.");
		}
	}

	// getter and setter
	public List<Map<String, User>> getUserList() {
		return userList;
	}

	public void setUserList(List<Map<String, User>> userList) {
		this.userList = userList;
	}

}
