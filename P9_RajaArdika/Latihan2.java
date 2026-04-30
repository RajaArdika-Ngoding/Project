//Interface

interface Pembayaran {
    void prosesBayar(double jumlah);
}

interface CetakStruk {
    void cetak();
}

class PembayaranOnline implements Pembayaran, CetakStruk {

    private double jumlah;

    public void prosesBayar(double jumlah) {
        this.jumlah = jumlah;
        System.out.println("Pembayaran online berhasil");
    }

    public void cetak() {
        System.out.println("Jumlah bayar: " + jumlah);
    }
}

public class Latihan2 {
    public static void main(String[] args) {

        PembayaranOnline p = new PembayaranOnline();

        p.prosesBayar(150000);
        p.cetak();
    }
}