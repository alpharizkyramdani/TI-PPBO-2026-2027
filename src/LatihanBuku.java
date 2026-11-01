public class LatihanBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku("Pemrograman Java Dasar", "Andi Wijaya", 2018);
        Buku b2 = new Buku("Struktur Data", "Rina Sari", 2012);

        b1.tampilkanData();
        System.out.println("---");
        b2.tampilkanData();
    }
}
