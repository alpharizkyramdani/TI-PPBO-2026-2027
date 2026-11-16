import java.util.Scanner ;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner (System.in) ;

        //Meminta pengguna memasukkan panjang dan lebar (tipe double)
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        // Menampilkan hasil luas dan keliling persegi panjang
        System.out.println("Luas Persegi Panjang    : " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        // Meminta pengguna memasukkan jari-jari lingkaran (tipe double)
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung luas dan keliling lingkaran mengunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jariJari;
        double luasLingkaran = Math.PI * jariJari * jariJari;

        // Menampilkan hasil luas dan keliling lingkaran
        System.out.println("Luas Lingkaran    : " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // Menyimpan status apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        // Menampilkan nilai variabel boolean luasBesar
        System.out.println("\nApakah luas persegi panjang > 100? " + luasBesar);

        // Menutup Scanner karena sudah tidak digunakan lagi
        input.close();
    }
}

