public class LatihanProduk {
    public static void main(String[] args) {
        ProdukLatihan pr1 = new ProdukLatihan("Laptop", 8500000);
        ProdukLatihan pr2 = new ProdukLatihan("Mouse", 150000);
        double batas = 1000000;

        System.out.println(pr1.namaProduk + " mahal? " + pr1.isMahal(batas));
        System.out.println(pr2.namaProduk + " mahal? " + pr2.isMahal(batas));
    }
}
