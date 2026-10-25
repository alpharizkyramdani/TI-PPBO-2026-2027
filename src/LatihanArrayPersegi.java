public class LatihanArrayPersegi {
    public static void main(String[] args) {
        Persegi[] daftar = new Persegi[4];
        daftar[0] = new Persegi(3);
        daftar[1] = new Persegi(8);
        daftar[2] = new Persegi(5.5);
        daftar[3] = new Persegi(6);

        Persegi terbesar = daftar[0];
        for (Persegi p : daftar) {
            if (p.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = p;
            }
        }
        System.out.println("Persegi dengan luas terbesar: sisi " + terbesar.sisi + ", luas " + terbesar.hitungLuas());
    }
}