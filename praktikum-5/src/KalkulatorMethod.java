import java.util.Scanner;

public class KalkulatorMethod {

    static double tambah(double a, double b) {
        return a + b;
    }

    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol.");
        }
        return a / b;
    }

    static double pangkat(double a, double b) {
        return Math.pow(a,b);
    }

    static double akarKuadrat(double a) {
        if (a < 0) {
            throw new ArithmeticException("Akar kuadrat dari bilangan negatif tidak diperbolehkan.");
        }
        return Math.sqrt(a);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] riwayatHasil = new double[0];

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n====================================");
            System.out.println("        KALKULATOR METHOD");
            System.out.println("=====================================");
            System.out.println("1. Penjumlahan (2 angka)");
            System.out.println("2. Penjumlahan (3 angka)");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.println("=====================================");

            System.out.print("Pilih operasi: ");
            int pilihan = input.nextInt();

            double hasil = 0;
            boolean berhasil = false;

            try {

                switch (pilihan) {

                    case 1:
                        System.out.print("Masukkan angka pertama: ");
                        double a1 = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b1 = input.nextDouble();

                        hasil = tambah(a1, b1);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 2:
                        System.out.print("Masukkan angka pertama: ");
                        double a2 = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b2 = input.nextDouble();

                        System.out.print("Masukkan angka ketiga: ");
                        double c2 = input.nextDouble();

                        hasil = tambah(a2, b2,c2);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 3:
                        System.out.print("Masukkan angka pertama: ");
                        double a3 = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b3 = input.nextDouble();

                        hasil = kurang(a3, b3);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 4:
                        System.out.print("Masukkan angka pertama: ");
                        double a4 = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b4 = input.nextDouble();

                        hasil = kali(a4, b4);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 5:
                        System.out.print("Masukkan angka pertama: ");
                        double a5 = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b5 = input.nextDouble();

                        hasil = bagi(a5, b5);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 6:
                        System.out.print("Masukkan bilangan: ");
                        double a6 = input.nextDouble();

                        System.out.print("Masukkan pangkat: ");
                        double b6 = input.nextDouble();

                        hasil = pangkat(a6, b6);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 7:
                        System.out.print("Masukkan bilangan");
                        double a7 = input.nextDouble();

                        hasil = akarKuadrat(a7);
                        berhasil = true;

                        System.out.println("Hasil = " + hasil);
                        break;

                    case 8:
                        berjalan = false;

                        // Menampilkan nilai maksimum sebelum keluar
                        if (riwayatHasil.length > 0) {
                            double maksimum = riwayatKeMaksimum(riwayatHasil);

                            System.out.println("\n====================================");
                            System.out.println("RIWAYAT PERHITUNGAN");
                            System.out.println("====================================");

                            for (int i = 0; i < riwayatHasil.length; i++) {
                                System.out.println((i + 1) + ". " + riwayatHasil[i]);
                            }

                            System.out.println("-----------------------------------");
                            System.out.println("Nilai maksimum = " + maksimum);
                        } else {
                            System.out.println("\nBelum ada perhitungan yang dilakukan.");
                        }

                        System.out.println("\nProgram selesai.");
                        break;

                    default:
                        System.out.println("Pilihan tidak tersedia.");
                }

                if (berhasil) {

                    double[] arrayBaru = new double[riwayatHasil.length + 1];

                    for (int i = 0; i < riwayatHasil.length; i++ ) {
                        arrayBaru[i] = riwayatHasil[i];
                    }

                    arrayBaru[riwayatHasil.length] = hasil;

                    riwayatHasil = arrayBaru;
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        input.close();
    }
}