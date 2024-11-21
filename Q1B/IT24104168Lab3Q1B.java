import java.util.Scanner;

public class IT24104168Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        double totalAmount = pricePerKg * quantity;
        double discount = totalAmount * 0.10;
        double amountAfterDiscount = totalAmount - discount;
        System.out.printf("The total amount before discount is: %.2f\n", totalAmount);
        System.out.printf("The discount is: %.2f\n", discount);
        System.out.printf("The total amount you have to pay after discount is: %.2f\n", amountAfterDiscount);
        scanner.close();
    }
}
