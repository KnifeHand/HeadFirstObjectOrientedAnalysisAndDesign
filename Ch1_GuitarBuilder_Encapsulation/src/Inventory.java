import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements the List interface to add guitar properties to the
 * inventory.
 */
public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    /**
     * Takes in all the properties required to create a new Guitar instance,
     * creates one, and adds it to the inventory.
     *
     * @param serialNumber - serial number.
     * @param price        - price.
     * @param spec         - specifics of guitar.
     *                     //     * @param builder - manufacturer of guitar.
     *                     //     * @param model - model.
     *                     //     * @param type - type of guitar
     *                     //     * @param backWood - type of wood on the back.
     *                     //     * @param topWood - type of wood on the top.
     */
    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {//, Builder builder,
//                          String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, spec);//, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    /**
     * Gets guitar attributes.
     *
     * @param serialNumber -
     * @return - Guitar attributes.
     */
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals((serialNumber))) {
                return guitar;
            }
        }
        return null;
    }

    /**
     * Compares each property of the Guitar object it's passed in to each Guitar
     * object in the inventory.
     * @param searchGuitar - Searches through the inventory of guitars to see if present.
     * @return - returns the user search parameters if in the inventory.
     */
//    public Guitar search(Guitar searchGuitar) {
//        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
//            Guitar guitar = (Guitar) i.next();
//            // Ignore serial number since that's unique
//            // Ignore price since that's unique
//            String builder = searchGuitar.getBuilder();
//            if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
//                continue;
//            String model = searchGuitar.getModel();
//            if ((model != null) && (!searchGuitar.equals("")) && (!model.equals(guitar.getModel())))
//                continue;
//            String type = searchGuitar.getType();
//            if ((type != null) && (!searchGuitar.equals("")) && (!type.equals(guitar.getType())))
//                continue;
//            String backWood = searchGuitar.getBackWood();
//            if ((backWood != null) && (!searchGuitar.equals("")) && (!backWood.equals(guitar.getType())))
//                continue;
//            String topWood = searchGuitar.getType();
//            if ((topWood != null) && (!searchGuitar.equals("")) && (!topWood.equals(guitar.getType())))
//                continue;
//        }
//        return guitar;
//    }

    /**
     * Compares each property of the Guitar object it's passed in to each Guitar
     * object in the inventory.
     *
     * @param searchSpec - Searches through the inventory of guitars to see if present.
     * @return - returns the user search parameters if in the inventory.
     */
    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            // Ignore serial number since that's unique
            // ignore price since that's unique
            if (guitar.getSpec().matches(searchSpec)) {
//            if (searchSpec.getBuilder() != guitarSpec.getBuilder())
//                continue;
//            String model = searchSpec.getModel().toLowerCase();
//            if (!model.equals("") && !model.equals(guitarSpec.getModel().toLowerCase()))
//                continue;
//            if (searchSpec.getType() != guitarSpec.getType())
//                continue;
//            if (searchSpec.getBackWood() != guitarSpec.getBackWood())
//                continue;
//            if (searchSpec.getTopWood() != guitarSpec.getTopWood())
//                continue;
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}
