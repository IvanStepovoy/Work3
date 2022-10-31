import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        while (true) {

            System.out.print("Please enter your number of channel: ");

            int inpValue = new Scanner(System.in).nextInt();

            String channels [] = {"Discovery", "Animal Planet", "National Geographic", "NatGeoWild", "Euronews",
                    "EuroSport", "Science", "MTV", "VIP Comedy"};

            if (inpValue != 0) {

                switch (inpValue) {
                    case 1:
                        System.out.println(channels[0]);
                        break;
                    case 2:
                        System.out.println(channels[1]);
                        break;
                    case 3:
                        System.out.println(channels[2]);
                        break;
                    case 4:
                        System.out.println(channels[3]);
                        break;
                    case 5:
                        System.out.println(channels[4]);
                        break;
                    case 6:
                        System.out.println(channels[5]);
                        break;
                    case 7:
                        System.out.println(channels[6]);
                        break;
                    case 8:
                        System.out.println(channels[7]);
                        break;
                    case 9:
                        System.out.println(channels[8]);
                        break;
                    default:
                        System.out.println("There is no such channel number, please re-enter number of channel.");
                        break;

                }

            } else {
                break;
            }


        }


    }
}
