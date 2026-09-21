import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        double tinggiM = tinggiCm / 100;
        double bmi = berat / (tinggiM * tinggiM);

        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurus";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Gemuk";
        } else {
            kategori = "Obesitas";
        }

        System.out.printf("BMI Anda : %.2f%n", bmi);
        System.out.println("Kategori : " + kategori);

        input.close();
    }
}
