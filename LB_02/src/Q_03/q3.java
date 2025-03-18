package Q_03;
import java.util.Scanner;
public class q3 {

        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.print("Enter Celsius value: ");
            double celsius = x.nextDouble();

            double fahrenheit = (1.8 * celsius) + 32;
            System.out.println(" Fahrenheit value: " + fahrenheit);


        
    }


}
