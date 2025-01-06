package teamproject2.devices;

public class KitchenDevice extends Device
		implements IIoTDevice, IVoiceControllable, ICookingDevice {
	boolean aboutFood;
	int cookingTime;
	boolean iotDevice;
	boolean voiceDevice;

	void cleanDevice() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".cleanDevice");
	}

	@Override
	public void enableVoiceControl() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + ".enableVoiceControl");
	}

	@Override
	public void disableVoiceControl() {
		// TODO: Auto-generated method stub
		throw new UnsupportedOperationException(
				this.getClass().getSimpleName() + ".disableVoiceControl");
	}

	@Override
	public void connectToIoT() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".connectToIoT");
	}

	@Override
	public void disconnectFromIoT() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".disconnectFromIoT");
	}

	@Override
	public void setCookingTime(int time) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".setCookingTime");
	}

	@Override
	public void startCooking() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".startCooking");
	}

	@Override
	public void stopCooking() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".stopCooking");
	}
	;

	public static class Builder extends Device.Builder<KitchenDevice> {
		private boolean aboutFood;
		private int cookingTime;
		private boolean iotDevice;
		private boolean voiceDevice;

		public KitchenDevice build() {
			var device = super.build();

			device.aboutFood = this.aboutFood;
			device.cookingTime = this.cookingTime;
			device.iotDevice = this.iotDevice;
			device.voiceDevice = this.voiceDevice;

			return device;
		}
	}
}
