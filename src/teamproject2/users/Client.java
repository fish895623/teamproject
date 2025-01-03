package teamproject2.users;

public class Client extends User {

	private String customerType;
	private String customerAdress;
	private String purchaseList;

	public Client(String userId, String userPassword, String userName, String email) {
		super(userId, userPassword, userName, email);
		// TODO Auto-generated constructor stub
	}

	public void viewDevice() {
	}

	public void purchaseDevise() {
	}

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

	public String getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(String purchaseList) {
		this.purchaseList = purchaseList;
	}

}
