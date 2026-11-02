public class Latihan3 {
    static double konversiSuhu(double celcius) {
        return (celcius * 9 / 5)  + 32;
    }

    static double konversiSuhu(double celcius, String skalaTujuan) {

        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celcius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celcius * 9 / 5) + 32;
        }

        return-1;
    }

    public static void main(String[] args) {

        double suhu = 25;

        System.out.println("Celcius ke Fahrenheit = " + konversiSuhu(suhu));
        System.out.println("Celcius ke Kelvin = " + konversiSuhu(suhu, "Kelvin"));
    }
}
