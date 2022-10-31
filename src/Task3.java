import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

         while (true) {

            System.out.print("Please enter your score: ");

            int score = new Scanner(System.in).nextInt();

            if (score >= 0 && score <= 100) {

                System.out.print("Congrats! You've passed the test!");

                break;

            } else {

                System.out.println("You input incorrect value, please try again!");

            }
        }


    }
}
