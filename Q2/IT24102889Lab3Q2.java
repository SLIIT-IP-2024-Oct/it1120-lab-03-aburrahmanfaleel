import java.util.Scanner;

public class IT24102889Lab3Q2 {
    public static void main(String[]args) {
        double monthlySalary, otHours, otHourlyRate, otAmount, totalSalary; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly salary: "); 
        monthlySalary = input.nextDouble();
        System.out.print("Enter number of OT hours: "); 
        otHours = input.nextDouble(); 
        System.out.print("Enter OT hourly rate: "); 
        otHourlyRate = input.nextDouble();
        otAmount = otHours * otHourlyRate; 
        totalSalary = monthlySalary + otAmount; 
        System.out.println("The OT amount is: " + otAmount); 
        System.out.println("The total salary is: " + totalSalary); 
    } }