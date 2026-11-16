public class LatihanProduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop", 7500000, 10);

        System.out.println("=== DATA PRODUK AWAL ===");
        produk1.tampilkanData();

        produk1.setHarga(7000000);
        produk1.setStok(8);

        System.out.println("\n=== DATA SETELAH DIUBAH ===");
        produk1.tampilkanData();

        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        produk1.setHarga(-500000);
        produk1.setStok(-5);

        System.out.println("\n=== DATA PRODUK AKHIR ===");
        produk1.tampilkanData();
    }
}