package teamproject2.users;

import teamproject2.devices.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client extends User {
    // data members
    private String customerType;
    private String customerAdress;
    private List<Map<Device, Integer>> cart = new ArrayList<>();
    private List<Map<Device, Integer>> purchaseList = new ArrayList<>();

    // constructors
    public Client(String userId, String userPassword, String userName, String email) {
        super(userId, userPassword, userName, email, false);
    }

    // adding customerType & customerAdress
    public Client(
            String userId,
            String userPassword,
            String userName,
            String email,
            String customerType,
            String customerAdress) {
        super(userId, userPassword, userName, email);
        this.customerType = customerType;
        this.customerAdress = customerAdress;
    }

    // adding purchaseList
    public Client(
            String userId,
            String userPassword,
            String userName,
            String email,
            String customerType,
            String customerAdress,
            List<Map<Device, Integer>> purchaseList) {
        super(userId, userPassword, userName, email);
        this.customerType = customerType;
        this.customerAdress = customerAdress;
        this.purchaseList = purchaseList;
    }

    // methods
    public void viewDevice() {}

    public void addToCart(Device item, int quantity) {
        cart.add(Map.of(item, quantity));
        System.out.println(item.nameString + " x " + quantity + " added to cart.");
    }

    public void viewCart() {
        float totalPrice = 0.0f;
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Cart Items");
            System.out.printf(
                    "| %-20s | %8s | %15s | %15s |\n",
                    "Device Name", "Quantity", "Price", "Total Price");
            System.out.printf(
                    "| -------------------- | -------- | --------------- | --------------- |\n");
            for (Map<Device, Integer> cartItem : cart) {
                for (Map.Entry<Device, Integer> entry : cartItem.entrySet()) {
                    Device item = entry.getKey();
                    int quantity = entry.getValue();
                    totalPrice += item.priceNumber * quantity;

                    System.out.printf(
                            "| %-20s | %8d | %15.2f | %15.2f |\n",
                            item.nameString,
                            quantity,
                            item.priceNumber,
                            item.priceNumber * quantity);
                }
            }
            System.out.println("Total items: " + cart.size());
            System.out.println("Total price: " + totalPrice);
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
            this.viewCart();
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

    public List<Map<Device, Integer>> getCart() {
        return cart;
    }
}
