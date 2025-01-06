package teamproject2.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import teamproject2.users.Admin;
import teamproject2.users.Client;
import teamproject2.users.User;

public class App {
	User user;
	Client client;
	Admin admin;

	Set<User> users;
	private User currentUser = null;

	App() {
		this.users = new HashSet<>();
		this.users.add(new Admin("admin", "admin", "asdf1", "asdf@gmail.com"));
		this.users.add(new Client("client", "client", "asdf2", "asdf@gmail.com"));
	}

	public User authenticate(String username, String password) {
		for (User user : users) {
			if (user.getUserId().equals(username) &&
					user.getUserPassword().equals(password)) {
				this.currentUser = user;
				return user;
			}
		}
		return null;
	}

	public void logout() {
		this.currentUser = null;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public boolean isLoggedIn() {
		return currentUser != null;
	}

	/** Entry point */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		App app = new App();

		System.out.println("Welcome to the system!");

		while (true) {
			if (!app.isLoggedIn()) {
				System.out.print("Username (or 'exit' to quit): ");
				String username = scanner.nextLine();

				if (username.equalsIgnoreCase("exit")) {
					break;
				}

				System.out.print("Password: ");
				String password = scanner.nextLine();

				User authenticatedUser = app.authenticate(username, password);
				if (authenticatedUser != null) {
					System.out.println("Login successful! Welcome " +
							authenticatedUser.getUserName());
				} else {
					System.out.println("Invalid username or password. Please try again.");
				}
			} else {
				// clear console for each commands
				System.out.printf("(%s) Enter 'help' to get commands: ", app.getCurrentUser().getUserName());
				String command = scanner.nextLine();
				if (command.equalsIgnoreCase("help")) {
					StringBuffer sb = new StringBuffer();
					sb.append("Available commands:\n");
					sb.append("logout\n");
					sb.append("add\n");
					sb.append("view\n");
					sb.append("checkout\n");
					sb.append("exit\n");
					System.out.println(sb.toString());
				} else if (command.equalsIgnoreCase("logout")) {
					app.logout();
					System.out.println("Logged out successfully!");
				} else if (command.equalsIgnoreCase("add")) {
					// TODO add device to cart
					System.out.println("Device added to cart.");
				} else if (command.equalsIgnoreCase("view")) {
					// TODO view cart
					System.out.println("Viewing cart...");
				} else if (command.equalsIgnoreCase("checkout")) {
					// TODO checkout
					System.out.println("Checking out...");
				} else if (command.equalsIgnoreCase("exit")) {
					break;
				} else {
					System.out.println("Invalid command. Please try again.");
					System.out.println("Type help to see commands");
				}
			}
		}

		System.out.println("Goodbye!");
		scanner.close();
	}
}
