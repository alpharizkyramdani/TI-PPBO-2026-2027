public class Manager extends Pegawai {
    protected double tunjanganJabatan;

    public Manager(String nama, String idPegawai, double gajiPokok, double tunjanganJabatan) {
        super(nama, idPegawai, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // Langkah 7: Override hitungGaji() pada Manager
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
}