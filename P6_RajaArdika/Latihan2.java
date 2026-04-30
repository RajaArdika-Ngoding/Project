//Implementasi Overloading Method

public class Latihan2 {

    private String nama;
    private String universitas;
    private String fakultas;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void tampil(String text) {
        System.out.println("Nama: " + nama);
        System.out.println("Universitas: " + universitas);
        System.out.println("Fakultas: " + fakultas);
    }

    public void tampil(int pilihan) {
        System.out.println("Nama: " + nama);
        System.out.println("Fakultas: " + fakultas);
    }

    public static void main(String[] args) {

        Latihan2 obj = new Latihan2();

        obj.setNama("Raja Ardika");
        obj.setUniversitas("Universitas Pamulang");
        obj.setFakultas("Ilmu Komputer");

        System.out.println("=== Method 1 ===");
        obj.tampil("Data Lengkap");

        System.out.println();

        System.out.println("=== Method 2 ===");
        obj.tampil(1);
    }
}

