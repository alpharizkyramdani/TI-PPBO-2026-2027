public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Alpha", "10078", 3.5);

        System.out.println("Nama: " + m1.getNama());
        System.out.println("Nim: " + m1.getNim());
        System.out.println("IPK awal: " + m1.getIpk());

        m1.setIpk(3.8);
        System.out.println("IPK setelah diubah: " + m1.getIpk());

        System.out.println("NIM tetap:  " + m1.getNim());

        // m1.setNim("999");
    }
}
