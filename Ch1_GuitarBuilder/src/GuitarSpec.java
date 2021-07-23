public class GuitarSpec {

    private Builder builder; // Enumerated type
    private Type type; // Enumerated type
    private String model;
    private Wood backWood; // Enumerated type
    private Wood topWood; // Enumerated type

    public GuitarSpec(Builder builder, String model, Type type,  Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
