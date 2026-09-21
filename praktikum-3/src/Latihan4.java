import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA_NORMAL = 50000;
        final int HARGA_KHUSUS = 30000;

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int harga;

        if (mahasiswa && umur < 25) {
            harga = HARGA_KHUSUS;
            System.out.println("Anda mendapat harga 1khusus mahasiswa! ");
        } else {
            harga = HARGA_NORMAL;
            System.out.println("Anda membayar harga normal.");
        }

        System.out.println("Harga tiket: Rp" + harga);

        input.close();
    }
}
