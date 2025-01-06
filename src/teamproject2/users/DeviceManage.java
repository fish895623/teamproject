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
		// NOTE remove this when finish adding fucntion
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

	// getter and setter
	public List<Map<Device, Integer>> getDeviceStock() {
		return deviceStock;
	}

	public void setDeviceStock(List<Map<Device, Integer>> deviceStock) {
		this.deviceStock = deviceStock;
	}
}
