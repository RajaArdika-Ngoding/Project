//Implementasi Class, Object, dan Method

public class Latihan1 {

    private String nama;
    private double nilaiMath;
    private double nilaiEnglish;
    private double nilaiScience;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilaiMath(double nilaiMath) {
        this.nilaiMath = nilaiMath;
    }

    public void setNilaiEnglish(double nilaiEnglish) {
        this.nilaiEnglish = nilaiEnglish;
    }

    public void setNilaiScience(double nilaiScience) {
        this.nilaiScience = nilaiScience;
    }

    public String getNama() {
        return nama;
    }

    public double getAverage() {
        double result = (nilaiMath + nilaiEnglish + nilaiScience) / 3;
        return result;
    }

    public String getKeterangan() {
        double avg = getAverage();

        if (avg >= 85) {
            return "Sangat Baik";
        } else if (avg >= 70) {
            return "Baik";
        } else if (avg >= 60) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }

    public void tampilData() {
        System.out.println("Nama: " + getNama());
        System.out.println("Rata-rata: " + getAverage());
        System.out.println("Keterangan: " + getKeterangan());
    }

    public static void main(String[] args) {

        Latihan1 siswa = new Latihan1();

        siswa.setNama("Raja Ardika");
        siswa.setNilaiMath(80);
        siswa.setNilaiEnglish(90);
        siswa.setNilaiScience(85);

        siswa.tampilData();
    }
}