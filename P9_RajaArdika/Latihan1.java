//Abstract Class

abstract class BangunDatar {

    public void info() {
        System.out.println("Menghitung luas bangun datar");
    }

    public abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}

class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return 3.14 * r * r;
    }
}

public class Latihan1 {
    public static void main(String[] args) {

        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(7);

        p.info();
        System.out.println("Luas Persegi: " + p.hitungLuas());

        System.out.println();

        l.info();
        System.out.println("Luas Lingkaran: " + l.hitungLuas());
    }
}