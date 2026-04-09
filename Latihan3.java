import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float makan, transport, belanja;
        float total, diskon, totalBayar;

        // Input
        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextFloat();

        System.out.print("Masukkan pengeluaran transport: ");
        transport = input.nextFloat();

        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextFloat();

        // Proses
        total = makan + transport + belanja;
        diskon = total * 10 / 100;
        totalBayar = total - diskon;

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.println("Total sebelum diskon: " + total);
        System.out.println("Diskon (10%): " + diskon);
        System.out.println("Total setelah diskon: " + totalBayar);
    }
}