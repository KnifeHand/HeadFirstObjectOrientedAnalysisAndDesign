public class Guitar {

    // Class properties
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    /**
     * Class Constructor that creates an new object
     *
     * @param serialNumber -
     * @param price        -
     */
    public Guitar(String serialNumber, double price, GuitarSpec spec){//, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;// = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
    }
//    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
//    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
