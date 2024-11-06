import java.util.Scanner;

public class IT24102889Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input rupee amount
        System.out.print("Enter the amount in rupees: ");
        int amount = input.nextInt();

        // Denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notes = new int[denominations.length];

        // Calculate the number of each note
        for (int i = 0; i < denominations.length; i++) {
            notes[i] = amount / denominations[i];
            amount = amount % denominations[i];
        }

        // Print the result
        System.out.println("The breakdown of the amount is:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes/Coin– " + notes[i]);
        }
    }
}
