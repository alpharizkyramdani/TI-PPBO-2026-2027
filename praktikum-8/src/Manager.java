public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String idPegawai,
                   double gajiPokok, double tunjanganJabatan) {
        super(nama, idPegawai, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }
}