package teamproject2.main;

import teamproject2.devices.Device;
import teamproject2.users.Admin;
import teamproject2.users.Client;
import teamproject2.users.DeviceManage;
import teamproject2.users.InvalidEmailException;
import teamproject2.users.User;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
	User user;
	Client client;
	Admin admin;
	DeviceManage deviceManage = new DeviceManage();

	Set<User> users = new HashSet<>();
	private User currentUser = null;

	App() throws InvalidEmailException {
		this.users.add(new Admin("admin", "admin", "asdf1", "asdf@gmail.com"));
		this.users.add(new Client("client", "client", "asdf2", "asdf@gmail.com"));
	}

	public User authenticate(String username, String password) {
		for (User user : users) {
			if (user.getUserId().equals(username) && user.getUserPassword().equals(password)) {
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

	/**
	 * Entry point
	 *
	 * @throws InterruptedException
	 * @throws InvalidEmailException
	 */
	public static void main(String[] args) throws InterruptedException, InvalidEmailException {
		System.out.println("Hello World");
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

				app.user = app.authenticate(username, password);
				if (app.user != null) {
					System.out.println("Login successful! Welcome " + app.user.getUserName());
					if (app.getCurrentUser().isAdmin()) {
						app.admin = (Admin) app.user;
					} else {
						app.client = (Client) app.user;
					}
				} else {
					System.out.println("Invalid username or password. Please try again.");
				}

			} else {
				// clear console for each commands
				System.out.printf(
						"(%s) Enter 'help' to get commands: ", app.getCurrentUser().getUserName());
				String command = scanner.nextLine();

				if (command.equalsIgnoreCase("help")) {
					StringBuffer sb = new StringBuffer();
					sb.append("Available commands:\n");
					sb.append("> logout\n");
					sb.append("> add\n");
					sb.append("> view\n");
					sb.append("> checkout\n");
					sb.append("> exit\n");
					System.out.println(sb.toString());
				} else if (command.equalsIgnoreCase("logout")) {
					app.logout();
					System.out.println("Logged out successfully!");
				} else if (command.equalsIgnoreCase("add")) {
					if (!app.getCurrentUser().isAdmin()) {
						app.addUserSelectDevice();

						System.out.print("Enter device name: ");
						String deviceName = scanner.nextLine();
						System.out.print("Enter quantity: ");
						int quantity = scanner.nextInt();

						var result = app.deviceManage.editNumDevice(deviceName.trim(), -quantity);
						if (result.success()) {
							app.client.addToCart(result.device(), quantity);
							System.out.println("Device added to cart successfully!");
						} else {
							System.out.println("Failed to add device to cart.");
						}
					}

				} else if (command.equalsIgnoreCase("view")) {
					if (!app.getCurrentUser().isAdmin()) {
						System.out.println("Viewing cart...");

						app.viewCart();
					}

				} else if (command.equalsIgnoreCase("checkout")) {
					if (!app.getCurrentUser().isAdmin()) {
						System.out.println("Checkout!");
						app.checkout();
					}

				} else if (command.equalsIgnoreCase("exit")) {
					break;
				}
			}
		}

		System.out.println("Goodbye!");
		scanner.close();
	}

	private void checkout() {
		System.out.println("Checkout");
		this.client.checkout();
	}

	private void viewCart() {
		this.client.viewCart();
	}

	/**
	 * Device list available in device stock
	 *
	 * @throws InterruptedException
	 */
	private void addUserSelectDevice() throws InterruptedException {
		// display all devices in stock using thread
		var thread = new Thread(
				new Runnable() {
					@Override
					public void run() {
						var a = deviceManage.getDeviceStock();
						System.out.printf("| %-20s | %8s | %15s |\n", "Device Name", "Quantity", "Price");
						System.out.printf("| -------------------- | -------- | --------------- |\n");
						for (Map<Device, Integer> stock : a) {
							for (Map.Entry<Device, Integer> entry : stock.entrySet()) {
								Device device = entry.getKey();
								Integer quantity = entry.getValue();
								System.out.printf(
										"| %-20s | %8d | %15.2f |\n",
										device.nameString, quantity, device.priceNumber);
							}
						}
					}
				});
		thread.start();
		thread.join();
	}
}
