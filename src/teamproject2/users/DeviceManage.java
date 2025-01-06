package teamproject2.users;

import java.util.List;
import java.util.Map;

import teamproject2.devices.Device;

public class DeviceManage {
	// data members
	private List<Map<Device, Integer>> dStock;
	
	// constructor
	DeviceManage(){
		this.dStock = new java.util.ArrayList<>(); // initiate
	}
	
	// methods
	public void dStockCheck(String nameString) {		
		for (Map<Device, Integer> stock : dStock) {			
            for (Map.Entry<Device, Integer> entry : stock.entrySet()) {
                Device device = entry.getKey();
                Integer quantity = entry.getValue();
                
                if (device.nameString.equals(nameString) && quantity == 0) {
                    stock.put(device, 10);
                    System.out.println("Stock for " + device.nameString + " was empty. Setting stock to 10.");
                }
            }
        }
	}

	// getter and setter
	public List<Map<Device, Integer>> getdStock() {
        return dStock;
    }

    public void setdStock(List<Map<Device, Integer>> dStock) {
        this.dStock = dStock;
    }

}
