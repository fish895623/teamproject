package teamproject2.devices;

public class MobileDevice extends Device implements INetworkConnectable {
	String software;
	boolean wearable;

	boolean network;
	boolean bluetooth;
	boolean wifi;

	void connectToWifi(String network) {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

	void disconnectFromWifi() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

	void connectToBluetooth(String device) {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

	void updateSoftware() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

	void checkBatteryLevel() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

	void enableNetworkConnection() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};

	void disableNetworkConnection() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void connectToNetwork() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void disconnectFromNetwork() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
	};
}
