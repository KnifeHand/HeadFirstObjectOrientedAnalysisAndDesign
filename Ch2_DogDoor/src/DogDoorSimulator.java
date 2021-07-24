/**
 * Requirements List: Todd and Gina's Dog Door, version 2.0
 *
 * 1. The dog door opening must be at least 12" tall.
 *      - This is something for hardware guys to deal with. We don't need code
 *        for this requirement.
 * 2. A button on the remote control Opens the dog door if the door is closed,
 *    and closes the dog door if the door is open.
 *      - This is where we write the code for this requirement.
 * 3. Once the dog door has opened, it should close automatically if the door
 *    isn't already closed.
 *      - This is what the customers added after talking to them.
 *      - We need to write code to take care of closing the door automatically.
 */

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote =  new Remote(door);

        // Update the simulator: Code Magnets pg 88
        System.out.println();
        remote.pressButton();
        System.out.println("Fido barks to go outside...");
        // This is the same as in our earlier version, but pressing the button
        // will open the door and start a timer to close the door.
//        remote.pressButton();

        System.out.println("\nFido has gone outside...");
        // In the new improved version, nobody needs to press the button to
        // close the door. That will happen automatically now.
//        remote.pressButton();

        System.out.println("\nFido is all done...");
        // Since the door's on a timer, Fido has plety of time to get back
        // inside before the door closes. No one needs to open the door to
        // let the dog back in.
//        remote.pressButton();

        // Update the simulator: Code Magnets pg 88
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("... but he's stuck outside!");
            System.out.println("\nFido starts barking...");
            System.out.println("... so Gina grabs the remote control.");
            remote.pressButton();
            System.out.println("\nFido's back inside...");
//            e.printStackTrace();
        }

        // Again, no need to press the button. Therefore, the door will
        // close automatically.
//        remote.pressButton();
    }
}