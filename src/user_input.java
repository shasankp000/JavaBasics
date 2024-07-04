import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim(); // trim is used to remove any whitespace

        System.out.println("Hello " + name + "!");


    }


}
