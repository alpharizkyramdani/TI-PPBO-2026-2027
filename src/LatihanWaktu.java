public class LatihanWaktu {
    public static void main(String[] args) {
        Waktu waktu1 = new Waktu(14, 30, 45);

        System.out.println("=== WAKTU AWAL ===");
        waktu1.tampilkanWaktu();

        waktu1.setJam(10);
        waktu1.setMenit(20);
        waktu1.setDetik(30);

        System.out.println("\n=== WAKTU SETELAH DIUBAH ===");
        waktu1.tampilkanWaktu();

        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        waktu1.setJam(25);
        waktu1.setMenit(70);
        waktu1.setDetik(80);

        System.out.println("\nWaktu akhir:");
        waktu1.tampilkanWaktu();
    }
}
