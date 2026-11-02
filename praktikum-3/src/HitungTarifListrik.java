import java.util.Locale;
import java.util.Scanner;

public class HitungTarifListrik {

    // tarif per kWh (Rp) untuk tiap golongan daya (nilai ditentukan sendiri)
    static final double TARIF_450 = 415;
    static final double TARIF_900 = 1352;
    static final double TARIF_1300 = 1445;
    static final double TARIF_2200 = 1500;
    static final double TARIF_ATAS = 1700; // di atas 2200 VA

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale indo = Locale.forLanguageTag("id_ID");

        System.out.println("=== HITUNG TAGIHAN LISTRIK ===");
        System.out.println("Pilihan golongan daya: 450, 900, 1300, 2200, atau di atas 2200 (VA)");

        System.out.print("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double kwh = input.nextDouble();

        boolean dayaValid = daya == 450 || daya == 900 || daya == 1300
                || daya == 2200 || daya > 2200;

        if (!dayaValid || kwh <= 0) {

            System.out.println("\n[ERROR) Input tidak valid!");
            if (!dayaValid) {
                System.out.println("- Golongan daya harus 450, 900, 1300, 2200, atau di atas 2200 VA. ");
            }
            if (kwh <= 0) {
                System.out.println("- Pemakaian kWh tidak boleh negatif atau nol.");
            }
            input.close();
            return;
        }

        double tarif;
        if (daya == 450) {
            tarif = TARIF_450;
        } else if (daya == 900) {
            tarif = TARIF_900;
        } else if (daya == 1300) {
            tarif = TARIF_1300;
        } else if (daya == 2200) {
            tarif = TARIF_2200;
        } else {
            tarif = TARIF_ATAS;
        }

        double total = kwh * tarif;

        System.out.println("\n============ RINCIAN TAGIHAN ============");
        System.out.printf("Golongan daya : %d VA%n", daya);
        System.out.printf("Pemakaian : %.2f kWh%n", kwh);
        System.out.println("Tarif per kWh : Rp" + String.format(indo, "%,.2f", tarif));
        System.out.println("------------------------------------");
        System.out.println("TOTAL TAGIHAN : Rp" + String.format(indo, "%,.2f", total));
        System.out.println("====================================");

        input.close();
    }
}
