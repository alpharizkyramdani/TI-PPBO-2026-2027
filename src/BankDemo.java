public class BankDemo {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank(
                "10001", "Alpharizky", "Tabungan", 1000000
        );

        RekeningBank rekening2 = new RekeningBank(
                "10002", "Budi Santoso", "Giro", 500000
        );

        System.out.println("\n=== SKENARIO 1: SETORAN BERHASIL ===");
        rekening1.setor(200000);

        System.out.println("\n=== SKENARIO 2: SETORAN GAGAL ===");
        rekening1.setor(-50000);

        System.out.println("\n=== SKENARIO 3: PENARIKAN BERHASIL ===");
        rekening1.tarik(100000);

        System.out.println("\n=== SKENARIO 4: PENARIKAN GAGAL ===");
        rekening2.tarik(2000000);

        System.out.println("\n=== SKENARIO 5: TRANSFER BERHASIL ===");
        rekening1.transferKe(rekening2, 300000);

        System.out.println("\n=== SKENARIO 6: TRANSFER GAGAL ===");
        rekening2.transferKe(rekening1, 5000000);

        System.out.println("\n=== SKENARIO 7: JUMLAH TRANSFER TIDAK VALID ===");
        rekening1.transferKe(rekening2, -100000);

        System.out.println("\n=== SKENARIO 8: TRANSFER KE REKENING SENDIRI ===");
        rekening1.transferKe(rekening1, 50000);

        System.out.println("\n=== MUTASI AKHIR REKENING 1 ===");
        rekening1.cetakMutasi();

        System.out.println("\n=== MUTASI AKHIR REKENING 2 ===");
        rekening2.cetakMutasi();
    }
}