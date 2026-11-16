import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");

        int a = input.nextInt();

        System.out.print("Massukkan bilangan kedua: ");
        int b = input.nextInt();

        // operator aritmatika
        System.out.println("Penjumlahan: " + (a + b));
        System.out.println("Pengurangan: " + (a - b));
        System.out.println("Perkalian: " + (a * b));
        System.out.println("Pembagian: " + (a/b));
        System.out.println("Modulus: " + (a %b));

        input.close();
    }
}
