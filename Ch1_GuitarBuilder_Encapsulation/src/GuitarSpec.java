public class GuitarSpec {

    private Builder builder; // Enumerated type
    private Type type; // Enumerated type
    private String model;
    private Wood backWood; // Enumerated type
    private Wood topWood; // Enumerated type
    private int numStrings;

    public int getNumStrings() {
        return numStrings;
    }

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
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

    public boolean matches(GuitarSpec otherSpec) {
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (numStrings != otherSpec.numStrings)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood)
            return false;
        return true;
    }
}
