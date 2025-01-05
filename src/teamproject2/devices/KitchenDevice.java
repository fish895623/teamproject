package teamproject2.devices;

public class KitchenDevice extends Device {
	boolean aboutFood;
	int cookingTime;
	boolean iotDevice;
	boolean voiceDevice;

	void setCookingTime(int time) {
		this.cookingTime = time;
	};

	void startCooking() {
		System.out.println("Cooking started");
	};

	void stopCooking() {
		System.out.println("Cooking stopped");
	};

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
