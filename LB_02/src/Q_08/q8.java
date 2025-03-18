package Q_08;
import java.util.Scanner;
public class q8 {

    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);


            System.out.print("Enter the radius : ");
            double radius = x.nextDouble();


            double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
            System.out.println("The volume of the sphere is: " + volume);



        }
    }

