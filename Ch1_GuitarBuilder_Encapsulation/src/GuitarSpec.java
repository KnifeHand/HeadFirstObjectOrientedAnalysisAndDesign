/**
 * This class can put all potentially duplicate code from the Guitar class here
 * and then have Guitar objects reference an instance of it to ovoid any
 * duplication. This object stores just the specs that clients want to send to
 * the search() method. That way they are not sending an entire Guitar object.
 */
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

    /**
     * Class Constructor
     *
     * @param builder
     * @param model
     * @param type
     * @param numStrings
     * @param backWood
     * @param topWood
     */
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

    /**
     * Delegation makes code more reusable. It also lets each object worry
     * about its own functionality, rather than spreading the code that handles
     * a single object's behavior all throughout your applicaiton.
     *
     * One of the most common examples of delegation in Java is the equals()
     * method. Instead of a method trying to figure out if two objects are
     * equal, it calls equals() on one of the objects and passes in the
     * second object. Then it just gets back a true or false response from
     * the equals() method.
     *
     * @param otherSpec -
     * @return
     */
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
