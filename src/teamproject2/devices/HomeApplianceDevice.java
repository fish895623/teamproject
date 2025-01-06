package teamproject2.devices;

import java.util.Date;

public class HomeApplianceDevice extends Device implements IIoTDevice, IVoiceControllable {
    String location;
    boolean iotDevice;
    boolean voiceDevice;

    void setLocation(String newLocation) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".setLocation");
    }
    ;

    void scheduleOperation(Date time) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException(
                this.getClass().getSimpleName() + ".scheduleOperation");
    }
    ;

    void cancelScheduledOperation() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException(
                this.getClass().getSimpleName() + ".cancelScheduledOperation");
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
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".connectToIoT");
    }

    @Override
    public void disconnectFromIoT() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
                this.getClass().getSimpleName() + ".disconnectFromIoT");
    }
    ;

    public static class Builder extends Device.Builder<HomeApplianceDevice> {
        private String location;
        private boolean iotDevice;
        private boolean voiceDevice;

        public HomeApplianceDevice build() {
            var device = super.build();
            device.location = this.location;
            device.iotDevice = this.iotDevice;
            device.voiceDevice = this.voiceDevice;
            return device;
        }
    }
}
