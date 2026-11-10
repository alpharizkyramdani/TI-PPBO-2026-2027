public class Pegawai {
    protected String nama;
    protected String idPegawai;
    protected double gajiPokok;

    public Pegawai(String nama, String idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + idPegawai);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }

    // Langkah 6: Method default yang akan di-override oleh subclass
    public double hitungGaji() {
        return gajiPokok;
    }
}