package teamproject2.users;

import java.util.List;
import java.util.Map;

import teamproject2.devices.Device;

public class Client extends User {
	// data members
	private String customerType;
	private String customerAdress;
	private List<Map<Device, Integer>> cart;
	private List<Map<Device, Integer>> purchaseList;

	// constructors
	public Client(String userId, String userPassword, String userName, String email) {
		 super(userId, userPassword, userName, email);
	 }

	// adding customerType & customerAdress
	public Client(String userId, String userPassword, String userName, String email, String customerType, String customerAdress) {
		super(userId, userPassword, userName, email);
		this.customerType = customerType;
		this.customerAdress = customerAdress;
	}

	// adding purchaseList
	public Client(String userId, String userPassword, String userName, String email, String customerType,
			String customerAdress, List<Map<Device, Integer>> purchaseList) {
		super(userId, userPassword, userName, email);
		this.customerType = customerType;
		this.customerAdress = customerAdress;
		this.purchaseList = purchaseList;
	}

	// methods
	public void viewDevice() {
	}

	public void addToCart(Device item, int quantity) {
		cart.add(Map.of(item, quantity));
		System.out.println(item + " added to cart.");
	}

	public void viewCart() {
		if (cart.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			System.out.println("Cart Items");
			for (Map<Device, Integer> cartItem : cart) {
				for (Map.Entry<Device, Integer> entry : cartItem.entrySet()) {
					Device item = entry.getKey();
					int quantity = entry.getValue();

					System.out.println(item + " x " + quantity + " " + (item.priceNumber * quantity));
				}
			}
			System.out.println("Total items in your cart: " + cart.size());
		}
	}

	public void totalPriceInCart() {
		if (cart.isEmpty()) {
			System.out.println("Your cart is empty.");
			return;
		}

		double totalPrice = 0.0;
		for (Map<Device, Integer> cartItem : cart) {
			for (Map.Entry<Device, Integer> entry : cartItem.entrySet()) {
				Device item = entry.getKey();
				int quantity = entry.getValue();

				totalPrice += item.priceNumber * quantity;
			}
		}

		System.out.println("Total price of items in your cart: " + totalPrice + "₩");
	}

	/** Purchase complete */
	public void checkout() {
		if (cart.isEmpty()) {
			System.out.println("Your cart is empty. Add items to the cart first.");
		} else {
			for (Map<Device, Integer> cartItem : cart) {
				for (Map.Entry<Device, Integer> entry : cartItem.entrySet()) {
					Device item = entry.getKey();

					System.out.println(item);
				}
			}
			cart.clear();
		}
	}

	 // Purchase history
	 public void viewPurchaseList() {
		 if (purchaseList.isEmpty()) {
	        System.out.println("Your purchase list is empty.");
	        } else {
	        System.out.println("Your purchase history:");
	        // Print each item in the purchase list
	        for (Map<Device, Integer> purchase : purchaseList) {
	            System.out.println(purchase);
	        }
	    }
	 }

	// getters and setters
	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerAdress() {
		return customerAdress;
	}

	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}

	 public List<Map<Device, Integer>> getPurchaseList() {
	 return purchaseList;
	 }

	 public void setPurchaseList(List<Map<Device, Integer>> purchaseList) {
	 this.purchaseList = purchaseList;
	 }
}
