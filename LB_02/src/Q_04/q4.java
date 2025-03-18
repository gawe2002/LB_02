package Q_04;
import java.util.Scanner;

public class q4 {

        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);

            System.out.print("Enter the weight : ");
            double bodyWeight = x.nextDouble();

            double calories = bodyWeight * 19;

            System.out.println("number of calories for person needed per oneday:"+calories);



        }
    }


