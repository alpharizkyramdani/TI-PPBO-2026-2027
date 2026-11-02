public class Siswa {
    private String nama;
    private double nilai;

    public Siswa(String nama, double nilai) {
        this.nama = nama;
        setNilai(nilai);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid! Harus 0-100.");
        }
    }

    public char getNilaiHuruf() {
        if (nilai >= 85) {
            return 'A';
        } else if (nilai >= 75) {
            return 'B';
        } else if (nilai >= 65) {
            return 'C';
        } else if (nilai >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public void tampilkanData() {
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Angka : " + nilai);
        System.out.println("Nilai Huruf : " + getNilaiHuruf());
    }
}