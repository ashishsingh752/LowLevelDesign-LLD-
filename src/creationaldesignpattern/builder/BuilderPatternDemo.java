package creationaldesignpattern.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .storage("2TB NVMe SSD")
                .hasGraphicsCard(true)
                .hasBluetooth(true)
                .build();

        Computer officePC = new Computer.Builder("Intel i5", "16GB")
                .build();  // Uses defaults for optionals

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}