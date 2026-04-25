/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Zaro
 */
public class Latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float kehadiran, nilai_akhir;
        float p_hadir;
        
        System.out.print("Masukkan Kehadiran : ");
        kehadiran = input.nextInt();
        System.out.print("Masukkan Nilai_Akhir : ");
        nilai_akhir = input.nextInt();
        
                // Proses persentase kehadiran
        p_hadir = kehadiran / 21;

        char grade;

        if (p_hadir > 0.75) {
            // Penentuan grade normal
            if (nilai_akhir >= 80) {
                grade = 'A';
            } else if (nilai_akhir >= 70) {
                grade = 'B';
            } else if (nilai_akhir >= 60) {
                grade = 'C';
            } else if (nilai_akhir >= 55) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println("Nilai Akhir : " + nilai_akhir);
            System.out.println("Grade : " + grade);

        } else {
            // Kehadiran < 75%
            if (nilai_akhir > 55) {
                nilai_akhir = 55;
                grade = 'D';
            } else {
                grade = 'D';
            }

            System.out.println("Nilai Akhir : " + nilai_akhir);
            System.out.println("Grade : " + grade);
        }
    }
}
