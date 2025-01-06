package teamproject2.devices;

public class MobileDevice extends Device implements INetworkConnectable {
  String software;
  boolean wearable;

  boolean network;
  boolean bluetooth;
  boolean wifi;

  void connectToWifi(String network) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".connectToWifi");
  }
  ;

  void disconnectFromWifi() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(
        this.getClass().getSimpleName() + ".disconnectFromWifi");
  }
  ;

  void connectToBluetooth(String device) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(
        this.getClass().getSimpleName() + ".connectToBluetooth");
  }
  ;

  void updateSoftware() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".updateSoftware");
  }
  ;

  void checkBatteryLevel() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".checkBatteryLevel");
  }
  ;

  void enableNetworkConnection() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(
        this.getClass().getSimpleName() + ".enableNetworkConnection");
  }
  ;

  void disableNetworkConnection() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException(
        this.getClass().getSimpleName() + ".disableNetworkConnection");
  }

  @Override
  public void connectToNetwork() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(this.getClass().getSimpleName() + ".connectToNetwork");
  }

  @Override
  public void disconnectFromNetwork() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        this.getClass().getSimpleName() + ".disconnectFromNetwork");
  }
  ;

  public static class Builder extends Device.Builder<MobileDevice> {
    String software;
    boolean wearable;

    boolean network;
    boolean bluetooth;
    boolean wifi;

    @Override
    public MobileDevice build() {
      var device = new MobileDevice();
      device.software = this.software;
      device.wearable = this.wearable;
      device.network = this.network;
      device.bluetooth = this.bluetooth;
      device.wifi = this.wifi;

      return device;
    }
  }
}
