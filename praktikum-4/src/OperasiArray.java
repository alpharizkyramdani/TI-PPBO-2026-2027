public class OperasiArray {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 88};
        int total = 0;

        for (int n : nilai) {
            total += n; // sama dengan total = total + n;
        }
        double rataRata = (double) total / nilai.length;

        int cari = 90;
        int posisi = -1; // -1 berarti belum/tidak ditemukan
        for (int i= 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Nilai " + cari + " ditemukan di indeks " + posisi);
        } else {
            System.out.println("Nilai " + cari + " tidak ditemukan");
        }
    }
}
