package Main;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter income: ");
        double income = scanner.nextDouble();

        double tax;

        if (!(income <= 10000)) {

            if (income <= 25000) {
        tax = 10000 * 0.025 + (income - 10000) * 0.043;}
            else {
        tax = 10000 * 0.025 + 15000 * 0.043 +
                (income - 25000) * 0.067;}
        }
        else {tax = income * 0.025;}

        System.out.printf("Tax amount: %.2f\n", tax);
    }
}
