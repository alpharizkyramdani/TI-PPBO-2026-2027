public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Alpha", "10078", 3.5);

        System.out.println("Nama: " + m1.GetNama());
        System.out.println("Nim: " + m1.GetNim());
        System.out.println("IPK: " + m1.GetIpk());
    }
}
