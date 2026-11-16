<<<<<<< HEAD
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(String namaBangun, double sisi) {
        super(namaBangun);
        this.sisi = sisi;
    }

    @Override
=======
public class Persegi {
    double sisi;

    public Persegi (double sisi) {
        this.sisi = sisi;
    }

>>>>>>> d355257b8e38cc5463f3917f6da7112199d04677
    public double hitungLuas() {
        return sisi * sisi;
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> d355257b8e38cc5463f3917f6da7112199d04677
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
