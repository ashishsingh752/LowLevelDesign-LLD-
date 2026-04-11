package creationaldesignpattern.builder;

// Product class
public class Computer {

    private final String cpu;           // required
    private final String ram;           // required
    private final String storage;       // optional → can be default
    private final Boolean hasGraphicsCard;  // optional → can be null (wrapper)
    private final Boolean hasBluetooth;     // optional → can be null (wrapper)

    // Private constructor - only Builder can call it
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;           // can be null
        this.hasGraphicsCard = builder.hasGraphicsCard; // can be null
        this.hasBluetooth = builder.hasBluetooth;       // can be null
    }

    // Getters
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public Boolean hasGraphicsCard() { return hasGraphicsCard; }
    public Boolean hasBluetooth() { return hasBluetooth; }

    @Override
    public String toString() {
        return "Computer {" +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", Storage='" + storage + '\'' +
                ", GraphicsCard=" + hasGraphicsCard +
                ", Bluetooth=" + hasBluetooth +
                '}';
    }

    // ==================== BUILDER CLASS ====================
    public static class Builder {

        // Required fields
        private final String cpu;
        private final String ram;

        private String storage = "512GB SSD";  // with default value 
        // Optional fields - NO default values, initialized to null
        private Boolean hasGraphicsCard = null;
        private Boolean hasBluetooth = null;

        // Constructor with required parameters
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Fluent methods for optional fields
        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder hasGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;   // autoboxing to Boolean
            return this;
        }

        public Builder hasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;         // autoboxing to Boolean
            return this;
        }

        // Build method
        public Computer build() {
            // Optional: You can add validation here if needed
            if (cpu == null || cpu.isBlank() || ram == null || ram.isBlank()) {
                throw new IllegalStateException("CPU and RAM are required fields");
            }
            return new Computer(this);
        }
    }
}
