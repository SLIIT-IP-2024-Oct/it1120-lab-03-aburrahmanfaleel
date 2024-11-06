import java.util.Scanner;

public class IT24102889Lab3Q1A {
public static void main(String[]args) {
    double pricePerKg,quantity,totalAmount;
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter price per of 1Kg of rice:");
    pricePerKg=Input.nextDouble();
    System.out.print("Enter the number of kilograms you want to buy:");
    quantity=Input.nextDouble();
    totalAmount=pricePerKg*quantity;
    System.out.println();
    System.out.println("The total amount is:"+totalAmount);
 }
}