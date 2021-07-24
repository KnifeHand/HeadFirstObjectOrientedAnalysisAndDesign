import java.util.Timer;
import java.util.TimerTask;

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

public class Remote {

    private DogDoor door;

    public Remote(DogDoor door){
        this.door = door;
    }

    /**
     * This checks the state of the door before open or closing it. Meaning,
     * a Thread is used to close the dog door. The Thread is initiated in the
     * background but the Timer makes a running task in the future easy.
     *
     * The timer variable is 'final' because we need to call its cancel()
     * method in the TimerTask anonymous class. If you access variables in
     * your anonymous class from the enclosing class (Remote in this case),
     * those variables must be final.
     *
     * It turns out in most cases, JVM's take forever before they garbage
     * collect the Timer. That ends up hanging the program, and your code
     * will run for hours before it actually quits gracefully. However, calling
     * cancel() manually takes care of the problem.
     */
    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if(door.isOpen()){
            // The remote already has code to handle closing the door if it's
            // open.
            door.close();
        } else{
            door.open();

            // Create a new Timer so we can schedule the dog door closing.
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // This task closes the door, and then turns off the
                    // timer.
                    door.close();
                    timer.cancel();
                }
                // This tells the timer how long to wait before executing the
                // task... in this case we're waiting 5 seconds
            }, 5000); // 5000 milliseconds.
        }
    }
}