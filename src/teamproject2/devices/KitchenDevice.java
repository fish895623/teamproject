package teamproject2.devices;

public class KitchenDevice extends Device {
	boolean aboutFood;
	int cookingTime;
	boolean iotDevice;
	boolean voiceDevice;

	void cleanDevice() {
		System.out.println("Device has been cleaned");
	};

	void connectToIoT() {
		System.out.println("Connected to IoT");
	};

	void disconnectFromIoT() {
		System.out.println("Disconnected from IoT");
	};

	void enableVoiceControl() {
		System.out.println("Voice control enabled");
	};

	void disableVoiceControl() {
		System.out.println("Voice control disabled");
	};
}
