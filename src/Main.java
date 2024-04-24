import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        // We are asking the user to enter the temperature value.

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");

            //Since the temperature falls between 10 and 15 degrees, we open a separate section and inform the user that they can choose either category.

        } else if (heat >= 10 && heat <= 15) {
            System.out.println("Pikniğe yada Sinemaya Gidebilirsiniz.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (heat >= 10 && heat <= 25) {
            System.out.println("Pikniğe Gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}