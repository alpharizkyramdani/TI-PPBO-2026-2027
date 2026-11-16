public class HewanDemo {
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";

        Anjing anjing = new Anjing();
        anjing.nama = "Buddy";

        System.out.println("=== DATA HEWAN ===");

        System.out.println("Nama Hewan: " + kucing.nama);
        kucing.bersuara();

        System.out.println();

        System.out.println("Nama Hewan: " + anjing.nama);
        anjing.bersuara();
    }
}
