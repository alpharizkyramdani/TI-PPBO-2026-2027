public class Motor extends Kendaraan{
    private String jenisMotor;

    public Motor(String merk, double kecepatanMaks, String jenisMotor) {
        super(merk, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }
}
