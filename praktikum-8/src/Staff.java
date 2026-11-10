public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String idPegawai,
                 double gajiPokok, double tunjanganKinerja) {
        super(nama, idPegawai, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }
}