package Q_07;
import java.util.Scanner;
public class q7 {


    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);


            System.out.print("Enter your weight in kg: ");
            double weight = x.nextDouble();

            System.out.print("Enter your height in cm: ");
            int height = x.nextInt();


            double height_meter = height / 100.0;
            double bmi = weight / (height_meter * height_meter);

            System.out.println("BMI is: " + bmi);



        }
    }


