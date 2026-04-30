package Project.P3_RajaArdika;

public class Latihan1 {
    public static void main(String[] args) {

        // Konversi otomatis (widening)
        int nilaiInt = 20;
        double nilaiDouble = nilaiInt;

        System.out.println("=== Konversi Otomatis ===");
        System.out.println("Nilai int: " + nilaiInt);
        System.out.println("Nilai double: " + nilaiDouble);

        // Casting manual (narrowing)
        double angkaDouble = 15.75;
        int angkaInt = (int) angkaDouble;

        System.out.println("\n=== Casting Manual ===");
        System.out.println("Nilai double: " + angkaDouble);
        System.out.println("Nilai int hasil casting: " + angkaInt);

        // Contoh kehilangan data (truncation)
        long nilaiLong = 123456789123L;
        int hasilInt = (int) nilaiLong;

        System.out.println("\n=== Truncation ===");
        System.out.println("Nilai long: " + nilaiLong);
        System.out.println("Nilai int hasil casting: " + hasilInt);
    }
}