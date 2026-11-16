public class Pegawai {
    protected String nama;
    protected String idPegawai;
    protected double gajiPokok;

    public Pegawai(String nama, String idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;

        if (gajiPokok < 0) {
            System.out.println("Peringatan: Gaji pokok tidak boleh negatif!");
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
    }
}