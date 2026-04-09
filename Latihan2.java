import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float makan, transport, belanja, total;
        float p_makan, p_transport, p_belanja;

        // Input
        System.out.print("Masukkan pengeluaran makan: ");
        makan = input.nextFloat();

        System.out.print("Masukkan pengeluaran transport: ");
        transport = input.nextFloat();

        System.out.print("Masukkan pengeluaran belanja: ");
        belanja = input.nextFloat();

        // Proses
        total = makan + transport + belanja;

        p_makan = (makan / total) * 100;
        p_transport = (transport / total) * 100;
        p_belanja = (belanja / total) * 100;

        // Output
        System.out.println("\n=== HASIL ===");
        System.out.println("Total Pengeluaran: " + total);
        System.out.println("Persentase Makan: " + p_makan + "%");
        System.out.println("Persentase Transport: " + p_transport + "%");
        System.out.println("Persentase Belanja: " + p_belanja + "%");
    }
}