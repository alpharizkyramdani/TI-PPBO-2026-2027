public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String idPegawai,
                    double gajiPokok, double tunjanganJabatan,
                    double tunjanganSaham) {
        super(nama, idPegawai, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    public double getTunjanganSaham() {
        return tunjanganSaham;
    }
}