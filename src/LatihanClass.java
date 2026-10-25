public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m2 = new Mahasiswa("Alpha", "10078", 3.90);

        m2.tampilkanData();
        System.out.println("Cumlaude? " + m2.isCumlaude());
    }
}
