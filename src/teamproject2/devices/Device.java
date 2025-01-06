package teamproject2.devices;

public class Device implements IDeviceInfo {
    int powerConsumption; // kWh
    int warranty;
    String carbonEmission;
    float annualEnergyCost;
    float weight, height, width, depth;
    String size;

    public String nameString;
    public double priceNumber;

    @Override
    public void getSize() {
        System.out.println(
                "Size: " + size + " (WxHxD: " + width + "x" + height + "x" + depth + "cm)");
    }

    @Override
    public void printDeviceName() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException(
                this.getClass().getSimpleName() + ".printDeviceName");
    }
    ;

    public static class Builder<T extends Device> {
        private int powerConsumption;
        private int warranty;
        private float annualEnergyCost;
        private float weight;
        private float height;
        private float width;
        private float depth;
        private String size;
        private String nameString;
        private double priceNumber;

        public Builder<T> powerConsumption(int powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder<T> warranty(int warranty) {
            this.warranty = warranty;
            return this;
        }

        public Builder<T> annualEnergyCost(float annualEnergyCost) {
            this.annualEnergyCost = annualEnergyCost;
            return this;
        }

        public Builder<T> dimensions(float width, float height, float depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
            return this;
        }

        public Builder<T> size(String size) {
            this.size = size;
            return this;
        }

        public Builder<T> name(String nameString) {
            this.nameString = nameString;
            return this;
        }

        public Builder<T> price(double priceNumber) {
            this.priceNumber = priceNumber;
            return this;
        }

        public Builder<T> weight(float weight) {
            this.weight = weight;
            return this;
        }

        public T build() {
            T device = createDevice();
            device.powerConsumption = this.powerConsumption;
            device.warranty = this.warranty;
            device.annualEnergyCost = this.annualEnergyCost;
            device.weight = this.weight;
            device.height = this.height;
            device.width = this.width;
            device.depth = this.depth;
            device.size = this.size;
            device.nameString = this.nameString;
            device.priceNumber = this.priceNumber;
            device.carbonEmission = String.valueOf(device.annualEnergyCost * 0.00062);
            return device;
        }

        @SuppressWarnings("unchecked")
        protected T createDevice() {
            return (T) new Device();
        }
    }

    @SuppressWarnings("rawtypes")
    public static Builder builder() {
        return new Builder();
    }
}
