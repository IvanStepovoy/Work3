import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner gettext = new Scanner(System.in);

        while (true) {

            System.out.print("Please write 'Exit' to exit the loop: ");
            String text = gettext.nextLine();

            String anotheText = "Exit";

            boolean e = text.equals(anotheText);

            if (e == true){
                break;
            }

        }


    }
}