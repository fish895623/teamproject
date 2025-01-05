package teamproject2.devices;

public class KitchenDevice extends Device implements IIoTDevice, IVoiceControllable, ICookingDevice {
	boolean aboutFood;
	int cookingTime;
	boolean iotDevice;
	boolean voiceDevice;

	void cleanDevice() {
		System.out.println("Device has been cleaned");
	}

	@Override
	public void enableVoiceControl() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'enableVoiceControl'");
	}

	@Override
	public void disableVoiceControl() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'disableVoiceControl'");
	}

	@Override
	public void connectToIoT() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'connectToIoT'");
	}

	@Override
	public void disconnectFromIoT() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'disconnectFromIoT'");
	}

	@Override
	public void setCookingTime(int time) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'setCookingTime'");
	}

	@Override
	public void startCooking() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'startCooking'");
	}

	@Override
	public void stopCooking() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'stopCooking'");
	};

}
