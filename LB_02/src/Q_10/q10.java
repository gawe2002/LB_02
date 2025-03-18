package Q_10;
import java.util.Scanner;
public class q10 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter loan amount: ");
            double loan = scanner.nextDouble();

            System.out.print("Enter annual interest rate (%): ");
            double rate = scanner.nextDouble() / 100 / 12;


            System.out.print("Enter loan period (years): ");
            int years = scanner.nextInt();
            int months = years * 12;

            double monthlyPayment = (loan * rate) / (1 - Math.pow(1 + rate, -months));
            System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);


        }
    }








