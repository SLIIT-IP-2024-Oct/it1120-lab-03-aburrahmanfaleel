import java.util.Scanner;

public class IT24102889Lab3Q1B {
    public static void main(String[]args) {
    double pricePerKg,quantity,totalAmount,discount,discountAmrount;
    Scanner Input = new Scanner(System.in);
    System.out.print("Enter price per of 1Kg of rice:");
    pricePerKg=Input.nextDouble();
    System.out.print("Enter the number of kilograms you want to buy:");
    quantity=Input.nextDouble();
    totalAmount=pricePerKg*quantity;
    discount=totalAmount*(10.0/100);
    discountAmrount=totalAmount-discount;

    System.out.println();
    System.out.println("The total amount is:"+discountAmrount);
 }
}
