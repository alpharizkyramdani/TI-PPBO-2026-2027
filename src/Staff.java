public class Staff extends Pegawai {
    protected double tunjanganKinerja;

    public Staff(String nama, String idPegawai, double gajiPokok, double tunjanganKinerja) {
        super(nama, idPegawai, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    // Langkah 7: Override hitungGaji() pada Staff
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }
}