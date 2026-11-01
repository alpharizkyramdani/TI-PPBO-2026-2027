public class Mahasiswa {

    private String nama;
    private String nim;
    private double ipk;

    private String GetNama() {
        return nama;
    }

    private String GetNim() {
        return nim;
    }

    private double GetIpk() {
        return ipk;
    }

    public Mahasiswa (String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
            System.out.println("IPK berhasil diubah.");
        } else {
            System.out.println("IPK tidak valid! Harus 0.0 - 4.0.");
        }
    }
}
