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
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void disableVoiceControl() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void connectToIoT() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void disconnectFromIoT() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void setCookingTime(int time) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void startCooking() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void stopCooking() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

}
