import java.util.Scanner;

public class Latihan4 {

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("Nilai minimum = " + cariNilaiMinimum(data));
        System.out.println("Nilai maksimum = " + cariNilaiMaksimum(data));
    }

}
