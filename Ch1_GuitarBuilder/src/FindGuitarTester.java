import java.util.Iterator;
import java.util.List;

/**
 * Simulates a customer coming into guitar shop and requesting a guitar.
 * The application searches through the item inventory and returns a result.
 * This application includes both type safety and value safety with using
 * enumerations. This causes less maintenance with spelling errors and
 * letter casing.
 */
public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // We're using enumerated types. No typing mistakes.
        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        GuitarSpec whatMattLikes = new GuitarSpec(Builder.COLLINGS, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

//        List matchingGuitars = inventory.search(whatErinLikes);
        List matchingGuitars = inventory.search(whatMattLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a "
                        + spec.getBuilder() + " "
                        + spec.getModel() + " "
                        + spec.getType() + " guitar:\n  "
                        + spec.getBackWood() + " back and sides,\n  "
                        + spec.getTopWood() + " top.\nYou can have it for only $"
                        + guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    /**
     * Adds guitar to inventory List
     * @param inventory - passes an instance of the Inventory class
     */
    private static void initializeInventory(Inventory inventory) {
        // Add guitars to the inventory...
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V1111", 1001.95, Builder.COLLINGS, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

    }
}
