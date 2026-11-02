import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===MENU MAKANAN===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Bakso");
        System.out.println("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan: Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memesan: Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memesan: Sate Ayam");
                break;
            case 4:
                System.out.println("Anda memesan: Bakso");
                break;
            default:

                System.out.println("Pilihan tidak valid! ");

            }

            input.close();
        }
    }
