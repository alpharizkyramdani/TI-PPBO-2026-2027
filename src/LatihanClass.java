public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // membuat object
        m1.nama ="Alpha";
        m1.nim ="2025573010078";
        m1.ipk =3.90;

        Mahasiswa m2 = new Mahasiswa(); // membuat object
        m2.nama ="Khalil";
        m2.nim ="2025573010111";
        m2.ipk =3.90;

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}