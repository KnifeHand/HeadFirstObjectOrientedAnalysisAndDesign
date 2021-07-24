/**
 * Use Case: What the dog door does
 *
 * 1. Fido barks to be let out.
 * 2. Customer hears Fido barking.
 * 3. Customer presses the button on the remote.
 * 4. The dog door opens.
 * 5. Fido goes outside.
 * 6. Fido does his business.
 *  6.1. The door shuts automatically.
 *  6.2. Fido parks to be let back inside.
 *  6.3. Customer hears Fido barking (again).
 *  6.4. Customer presses the button on the remote control.
 *  6.5. The dog door opens (again).
 * 7. Fido goes back inside.
 * 8. The door shuts automatically.
 */
public class DogDoor {

    private boolean open;

    /**
     * Class Constructor.
     */
    public DogDoor() {
        this.open = false;
    }

    /**
     * Opens the door
     */
    public void open() {
        System.out.println("The dog door opens.");
        open = true;
    }

    /**
     * Closes the door
     */
    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    /**
     * This returns the state of the door.
     *
     * @return - open or closed.
     */
    public boolean isOpen() {
        return open;
    }
}
