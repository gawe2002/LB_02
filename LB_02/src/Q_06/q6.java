package Q_06;
import java.util.Scanner;
public class q6 {

    public static void main(String[] args) {
            Scanner x = new Scanner(System.in);

            System.out.print("Enter birth year: ");
            int birthYear = x.nextInt();

            int age = 2025 - birthYear;

            System.out.println("You were born in " + birthYear + " and are " + age + " years old.");


        }
    }


