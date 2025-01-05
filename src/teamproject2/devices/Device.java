package teamproject2.devices;

public class Device implements IDeviceInfo {
	int voltage;
	int warranty;
	String powerConsumption;
	String carbonEmission;
	float annualEnergyCost;
	float weight;
	float height;
	float width;
	float depth;
	String size;

	void turnOn() {
	};

	void turnOff() {
	};

	void checkWarranty() {
	}

	@Override
	public void getSize() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getSize'");
	}

	@Override
	public void printDeviceName() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'printDeviceName'");
	};
}
