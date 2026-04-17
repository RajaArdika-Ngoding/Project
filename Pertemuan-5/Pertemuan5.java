import java.util.Scanner;

public class Pertemuan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kehadiran, nilai_akhir;
        float p_hadir;
        char grade;

        System.out.print("Masukkan Kehadiran : ");
        kehadiran = input.nextFloat();

        System.out.print("Masukkan Nilai Akhir : ");
        nilai_akhir = input.nextFloat();

        // Proses persentase kehadiran (maksimal 21 pertemuan)
        p_hadir = kehadiran / 21;

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
        } else {
            // Kehadiran < 75%
            if (nilai_akhir > 55) {
                nilai_akhir = 55;
            }
            grade = 'D';
        }

        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("Grade : " + grade);

        input.close();
    }
}