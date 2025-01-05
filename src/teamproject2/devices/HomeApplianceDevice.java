package teamproject2.devices;

import java.util.Date;

public class HomeApplianceDevice extends Device implements IIoTDevice, IVoiceControllable {
	String location;
	boolean iotDevice;
	boolean voiceDevice;

	void setLocation(String newLocation) {
	};

	void scheduleOperation(Date time) {
	};

	void cancelScheduledOperation() {
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
	};
}
