package Q_02;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter centimeters: ");
            double cm_value= scanner.nextDouble();

            double inches = cm_value/ 2.54;
            int feet = (int) (inches / 12);
            double remainingInches = inches % 12;

            System.out.println(" value is:" + feet + " feet " + remainingInches + " inches.");



        }
    }




