package teamproject2.users;

import teamproject2.devices.Device;
import teamproject2.devices.HomeApplianceDevice;
import teamproject2.devices.KitchenDevice;
import teamproject2.devices.MobileDevice;

import java.util.List;
import java.util.Map;

public class DeviceManage {
	// data members
	private List<Map<Device, Integer>> deviceStock;

	// constructor
	public DeviceManage() {
		this.deviceStock = new java.util.ArrayList<>(); // initiate
		// NOTE remove this when finish adding function
		this.deviceStock.add(Map.of(Device.builder().name("Hello").build(), 1));
		this.deviceStock.add(
				Map.of(
						KitchenDevice.builder()
								.dimensions(1, 2, 3)
								.annualEnergyCost(0)
								.name("water dispenser")
								.price(100000)
								.build(),
						2));
		this.deviceStock.add(Map.of(HomeApplianceDevice.builder().name("Home test").build(), 1));
		this.deviceStock.add(Map.of(MobileDevice.builder().name("Mobile Test").build(), 1));
	}

	// methods
	public void checkDeviceStock(String nameString) {
		for (Map<Device, Integer> stock : deviceStock) {
			for (Map.Entry<Device, Integer> entry : stock.entrySet()) {
				Device device = entry.getKey();
				Integer quantity = entry.getValue();

				if (device.nameString.equals(nameString) && quantity == 0) {
					stock.put(device, 10);
					System.out.println(
							"Stock for " + device.nameString + " was empty. Setting stock to 10.");
				}
			}
		}
	}
	
	// editNumDevice()에서 stock 0 되면 자동으로 checkDeviceStock()가 작동하게 해야하나??
	public void editNumDevice(Client client) {
		
	    for (Map<Device, Integer> cartItem : client.getCart()) {
	        for (Map.Entry<Device, Integer> entry : cartItem.entrySet()) {
	            Device deviceInCart = entry.getKey();
	            int quantityInCart = entry.getValue();

	            // Iterate through the deviceStock to find and update the stock
	            for (Map<Device, Integer> stock : deviceStock) {
	                for (Map.Entry<Device, Integer> stockEntry : stock.entrySet()) {
	                    Device deviceInStock = stockEntry.getKey();
	                    int currentStock = stockEntry.getValue();

	                    // Check if the device in the cart matches the device in the stock
	                    if (deviceInCart.equals(deviceInStock)) {
	                        if (currentStock >= quantityInCart) {
	                            // Update stock
	                            stock.put(deviceInStock, currentStock - quantityInCart);
	                            System.out.println(quantityInCart + " " + deviceInCart.nameString + "(s) were removed from stock.");
	                        } else {
	                            System.out.println("Not enough stock for " + deviceInCart.nameString + ". Only " + currentStock + " left.");
	                        }
	                    }
	                }
	            }
	        }
	    }
	}


	// getter and setter
	public List<Map<Device, Integer>> getDeviceStock() {
		return deviceStock;
	}

	public void setDeviceStock(List<Map<Device, Integer>> deviceStock) {
		this.deviceStock = deviceStock;
	}
}
