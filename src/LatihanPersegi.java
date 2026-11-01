public class LatihanPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(4);
        Persegi p2 = new Persegi(7.5);

        System.out.println("Sisi " + p1.sisi + " -> Luas: " + p1.hitungLuas() + ", Keliling: " + p1.hitungKeliling());
        System.out.println("Sisi " + p2.sisi + " -> Luas: " + p2.hitungLuas() + ", Keliling: " + p2.hitungKeliling());
    }
}
