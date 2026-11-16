public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftar = new Produk[5];
        daftar[0] = new Produk("P001", "Laptop Asus", 8500000, 5);
        daftar[1] = new Produk("P002", "Mouse Logitech", 150000, 20);
        daftar[2] = new Produk("P003", "Keyboard Mekanik", 650000, 10);
        daftar[3] = new Produk("P004", "Monitor 24 Inch", 1800000, 3);
        daftar[4] = new Produk("P005", "Flashdisk 64GB", 90000, 50);

        System.out.println("=== DAFTAR PRODUK TOKO ===");
        for (Produk p : daftar) {
            p.tampilkanData();
            System.out.println("------------------------------");
        }

        System.out.println("\n=== SIMULASI PEMBELIAN ===");
        int jumlah1 = 2;
        System.out.println("Pembelian 1: " + jumlah1 + " unit " + daftar[0].namaProduk);
        System.out.printf("Total harga : Rp%.0f%n", daftar[0].hitungTotalHarga(jumlah1));
        daftar[0].kurangiStok(jumlah1);
        System.out.println("Sisa stok   : " + daftar[0].stok);

        System.out.println();
        int jumlah2 = 5;
        System.out.println("Pembelian 2: " + jumlah2 + " unit " + daftar[3].namaProduk);
        System.out.printf("Total harga : Rp%.0f%n", daftar[3].hitungTotalHarga(jumlah2));
        daftar[3].kurangiStok(jumlah2);
        System.out.println("Sisa stok   : " + daftar[3].stok);

        Produk termahal = daftar[0];
        for (Produk p : daftar) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }
        System.out.println("\n=== PRODUK TERMAHAL ===");
        termahal.tampilkanData();
    }
}
