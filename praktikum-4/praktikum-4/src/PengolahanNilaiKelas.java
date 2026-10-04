import java.util.Scanner;

public class PengolahanNilaiKelas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int KKM = 0;

        System.out.println("===========================================");
        System.out.println("         PROGRAM PENGOLAHAN NILAI KELAS");
        System.out.println("===========================================");

        System.out.print("Masukkan jumlah mahasiswa:  ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        System.out.println("\n --- Input Nilai Mahasiswa: ");

        for (int i = 0; i < N; i++) {
            System.out.print("Nlai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("\n===========================================");
        System.out.println("HASIL PENGOLAHAN NILAI");
        System.out.println("===========================================");

        System.out.print("Nilai sebelum diurutkan : ");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i]);

            if (i < N - 1) {
                System.out.print(", ");
            }
        }

        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < N; i++) {
            total += nilai[i];

            if (nilai[i] < nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = (double) total / N;

        for (int i = 0; i < N - 1; i++) {

            for (int j = 0; j < N - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.print("\nNilai sesudah diurutkan  : ");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i]);

            if (i < N - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("-----------------------------------------------------");
        System.out.println("KKM                           : " + KKM);
        System.out.printf("Nilai rata-rata               : %.2f%n",rataRata);
        System.out.println("Nilai tertinggi               : " + nilaiTertinggi);
        System.out.println("Nilai Terendah                : " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa lulus        : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus  : " + jumlahTidakLulus);
        System.out.println("-----------------------------------------------------");

        input.close();
    }
}
