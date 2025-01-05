package teamproject2.devices;

public class Device implements IDeviceInfo {
	int powerConsumption; // kWh
	int warranty;
	String carbonEmission;
	float annualEnergyCost;
	float weight, height, width, depth;
	String size;

	Device() {
		this.carbonEmission = String.valueOf(annualEnergyCost * 0.00062);
	}

	@Override
	public void getSize() {
		System.out.println("Size: " + size + " (WxHxD: " + width + "x" + height + "x" + depth + "cm)");
	}

	@Override
	public void printDeviceName() {
		System.out.println(this.getClass().getSimpleName());
	};
}
