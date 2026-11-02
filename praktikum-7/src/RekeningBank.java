public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private String jenisRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, String pemilik,
                        String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening;

        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("Saldo awal tidak valid. Saldo diatur menjadi Rp0.");
        }
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Setoran gagal: jumlah harus lebih dari 0.");
            return;
        }

        saldo += jumlah;
        System.out.printf("Setoran berhasil: Rp%.2f%n", jumlah);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Penarikan gagal: jumlah harus lebih dari 0.");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("Penarikan gagal: saldo tidak mencukupi.");
            return;
        }

        saldo -= jumlah;
        System.out.printf("Penarikan berhasil: Rp%.2f%n", jumlah);
    }

    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (tujuan == null) {
            System.out.println("Transfer gagal: rekening tujuan tidak valid.");
            return;
        }

        if (tujuan == this) {
            System.out.println("Transfer gagal: rekening tujuan tidak boleh sama.");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Transfer gagal: jumlah harus lebih dari 0.");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("Transfer gagal: saldo pengirim tidak mencukupi.");
            return;
        }

        saldo -= jumlah;
        tujuan.saldo += jumlah;

        System.out.printf(
                "Transfer berhasil: Rp%.2f dari %s ke %s.%n",
                jumlah, nomorRekening, tujuan.nomorRekening
        );
    }

    public void cetakMutasi() {
        System.out.println("==================================");
        System.out.println("         MUTASI REKENING");
        System.out.println("==================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.printf("Saldo           : Rp%.2f%n", saldo);
        System.out.println("==================================");
    }
}