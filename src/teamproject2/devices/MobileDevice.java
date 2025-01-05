package teamproject2.devices;

public class MobileDevice extends Device {
	String software;
	boolean wearable;

	boolean network;
	boolean bluetooth;
	boolean wifi;

	void connectToWifi(String network) {
		System.out.println("Connected to " + network);
	};

	void disconnectFromWifi() {
		System.out.println("Disconnected from wifi");
	};

	void connectToBluetooth(String device) {
		System.out.println("Connected to " + device);
	};

	void updateSoftware() {
	};

	void checkBatteryLevel() {
	};

	void enableNetworkConnection() {
	};

	void disableNetworkConnection() {
	};
}
