public class LatihanSiswa {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Alpharizky", 90);

        System.out.println("=== DATA SISWA AWAL ===");
        siswa1.tampilkanData();

        siswa1.setNilai(78);

        System.out.println("\n=== DATA SETELAH NILAI DIUBAH ===");
        siswa1.tampilkanData();

        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        siswa1.setNilai(120);

        System.out.println("\n=== DATA SISWA AKHIR ===");
        siswa1.tampilkanData();
    }
}