public class Latihan1 {
    static double luasPersegiPanjang(double p, double i) {
        return p*i;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
         double hasilPersegiPanjang =  luasPersegiPanjang(10, 5);
         double hasilLingkaran = luasLingkaran(7);

         System.out.println("Luas Persegi Panjang = " + hasilPersegiPanjang);
         System.out.println("Luas Lingkaran = " + hasilLingkaran);
    }
}
