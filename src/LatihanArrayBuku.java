public class LatihanArrayBuku {
    public static void main(String[] args) {
        Buku[] daftar = new Buku[5];
        daftar[0] = new Buku("Pemrograman Java Dasar", "Andi Wijaya", 2018);
        daftar[1] = new Buku("Struktur Data", "Rina Sari", 2012);
        daftar[2] = new Buku("Basis Data Modern", "Dewi Lestari", 2020);
        daftar[3] = new Buku("Jaringan Komputer", "Budi Santoso", 2015);
        daftar[4] = new Buku("Kecerdasan Buatan", "Fajar Nugroho", 2022);

        System.out.println("Buku yang terbit setelah tahun 2015:");
        for (Buku b : daftar) {
            if (b.tahunTerbit > 2015) {
                System.out.println("- " + b.judul + " (" + b.tahunTerbit + ")");
            }
        }
    }
}
