public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Alpha", "10078", 3.5);

        System.out.println("Nama: " + m1.GetNama());
        System.out.println("Nim: " + m1.GetNim());
        System.out.println("IPK awal: " + m1.GetIpk());

        m1.setIpk(3.8);
        System.out.println("IPK sekarang: " + m1.GetIpk());

        m1.setIpk(9.9);
        System.out.println("IPK sekarang:  " + m1.GetIpk());
    }
}
