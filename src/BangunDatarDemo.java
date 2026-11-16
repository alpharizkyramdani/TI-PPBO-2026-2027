public class BangunDatarDemo {
    public static void main(String[] args) {
        BangunDatar[] daftarBangun = {
                new Lingkaran("Lingkaran A", 7),
                new Persegi("Persegi A", 6),
                new PersegiPanjang("Persegi Panjang A", 8, 5),
                new Lingkaran("Lingkaran B", 10),
                new PersegiPanjang("Persegi Panjang B", 12, 4)
        };

        double totalLuas = 0;
        BangunDatar bangunTerbesar = daftarBangun[0];

        for (BangunDatar bd : daftarBangun) {
            bd.tampilkanInfo(); // Memanggil method dari superclass

            double luasSekarang = bd.hitungLuas();
            totalLuas += luasSekarang;

            if (luasSekarang > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = bd;
            }
        }

        System.out.println("Total Luas Seluruh Bangun : " + totalLuas);
        System.out.println("Bangun Luas Terbesar      : " + bangunTerbesar.namaBangun +
                " (" + bangunTerbesar.hitungLuas() + ")");
    }
}
