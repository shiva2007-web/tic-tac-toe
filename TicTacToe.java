import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
        // Testing UC3 logic
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * UC3: Reads an integer slot value (1-9) from the user.
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
}