import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah elemen: ");
        int n = input.nextInt();

        int [] angka = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) +":");
            angka[i] = input.nextInt();
        }

        int terbesar = angka [0];
        int kedua = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (angka[i] > terbesar) {
                kedua = terbesar;
                terbesar = angka[i];
            } else if (angka[i] > kedua && angka[i]!=terbesar) {
                kedua = angka[i];
            }
        }

        System.out.println("Terbesar = " + terbesar);
        System.out.println("Terbesar kedua = " + kedua);
    }
}
