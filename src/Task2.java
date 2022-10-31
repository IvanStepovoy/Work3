import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int inpttext = text.nextInt();

        while (inpttext < 0) {
            System.out.println("Please enter a number greater than zero.: ");
            inpttext = text.nextInt();
        }

        int sum = 0;

        for (int i = 0; i <= inpttext; i++) {

              sum += i;

                }
            System.out.printf("The sum of all numbers from 0 to %d is %d", inpttext, sum);

            }



    }


