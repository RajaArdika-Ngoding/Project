package Project.P3_RajaArdika;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nama: ");
            String nama = input.readLine();

            System.out.print("Masukkan umur: ");
            int umur = Integer.parseInt(input.readLine());

            System.out.println("\n=== Data Anda ===");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input!");
        } catch (NumberFormatException e) {
            System.out.println("Umur harus angka!");
        }
    }
}