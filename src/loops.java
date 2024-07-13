// Here we will experiment with a bunch of loops and some floating/double precision related stuff.
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        int integerStartTime;
        double doubleStartTime;

        Scanner integerScan = new Scanner(System.in);
        System.out.print("Enter integer start time: ");
        integerStartTime = integerScan.nextInt();

        System.out.println("Counting up to the start time using while loop: ");

        // use a bunch of loops to execute the same stuff.

        int i = 0;
        while(i<=integerStartTime) {

            System.out.println(i);
            i++;
        }



        Scanner doubleScan = new Scanner(System.in);
        System.out.print("Enter double start time: ");
        doubleStartTime = doubleScan.nextDouble();

        System.out.println("Counting up to the start time using for loop: ");

        for (double j = 0.0; j<=doubleStartTime; j+=0.25 ) {

            System.out.println(j); // precision issue.

        }

    }

}
