package teamproject2.users;

import java.util.List;

public class Client extends User {
	// data members
	private String customerType;
	private String customerAdress;
	private List<String> cart;
	private List<String> purchaseList;
	
	// constructor
	public Client(String userId, String userPassword, String userName, String email) {
		super(userId, userPassword, userName, email);
	}
	
	public Client(String userId, String userPassword, String userName, String email, String customerType,
			String customerAdress, List<String> purchaseList) {
		super(userId, userPassword, userName, email);
		this.customerType = customerType;
		this.customerAdress = customerAdress;
		this.purchaseList = purchaseList;
	}

	// methods
	public void viewDevice() {
	}
	
	public void addToCart(String item) {
        cart.add(item);
        System.out.println(item + " added to cart.");
    }
	
	public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Cart contents: " + String.join(", ", cart));
        }
    }

	public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Add items to the cart first.");
        } else {
            System.out.println("Proceeding to checkout with items: " + String.join(", ", cart));
            cart.clear(); 
        }
	}
	
	public void viewPurchaseList() {
		if (purchaseList.isEmpty()) {
            System.out.println("Your purchase list is empty.");
        } else {
            System.out.println("Your purchase history: " + String.join(", ", purchaseList)); 
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

	public List<String> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(List<String> purchaseList) {
		this.purchaseList = purchaseList;
	}
}
