public class PenggajianDemo {
    public static void main(String[] args) {
        Direktur dir = new Direktur("Rizky",
                "D001", 5000000, 2000000, 3000000);
        System.out.println("Gaji Direktur " + dir.nama + ": " + dir.hitungGaji());
    }
}

