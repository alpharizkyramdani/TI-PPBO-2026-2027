public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String merk, double kecepatanMaks, int jumlahPintu) {
        super(merk, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanData() {
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
