public class LatihanBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Budi Santoso", 2024);

        System.out.println("=== DATA BUKU AWAL ===");
        buku1.tampilkanData();

        buku1.setJudul("Belajar Java OOP");
        buku1.setPengarang("Andi Saputra");

        System.out.println("\n=== DATA BUKU SETELAH DIUBAH ===");
        System.out.println("Judul        : " + buku1.getJudul());
        System.out.println("Pengarang    : " + buku1.getPengarang());
        System.out.println("Tahun Terbit : " + buku1.getTahunTerbit());
    }
}