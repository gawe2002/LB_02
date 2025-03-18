package Q_05;

import java.util.Scanner;
public class q5 {

        public static void main(String[] args) {
            Scanner x= new Scanner(System.in);

            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = x.nextDouble();


            double celsius = (5.0 / 9) * (fahrenheit - 32);

            System.out.println("Temperature in Celsius: " + celsius);



        }
    }


