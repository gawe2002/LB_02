package Q_09;
import java.util.Scanner;
public class q9 {

    public static void main(String[] args) {
            Scanner x= new Scanner(System.in);



            System.out.print(" Give initial investment amount (P): ");
            double P = x.nextDouble();

            System.out.print("Give annual interest rate (R) in %: ");
            double R = x.nextDouble();

            System.out.print("Give Enter number of years (N): ");
            int N = x.nextInt();

            double finalAmount = P * Math.pow(1 + (R / 100), N);
            System.out.println("The amount after  relevant  years: $" + finalAmount);

        }
    }


