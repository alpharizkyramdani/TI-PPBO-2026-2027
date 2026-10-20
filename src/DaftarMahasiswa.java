public class DaftarMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0] = new Mahasiswa("Iqbal", "100", 3.6);
        daftar[1] = new Mahasiswa("Khalil", "200", 3.8);
        daftar[2] = new Mahasiswa("Pikri", "300", 3.2);

        for (Mahasiswa m : daftar) {
            m.tampilkanData();
            System.out.println("---");
        }

        int jumlahClaude = 0;
        for (Mahasiswa m : daftar) {
            if (m.isCumlaude()) {
                jumlahClaude++;
            }
        }

        System.out.println("Jumlah mahasiswa cumlaude: " + jumlahClaude);
    }
}
