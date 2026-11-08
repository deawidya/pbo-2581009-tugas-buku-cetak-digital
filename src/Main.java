public class Main {
    public static void main(String[] args) {
        BukuCetak buku1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750
        );
        BukuCetak buku2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400
        );
        BukuDigital buku3 = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5
        );

        // Menampilkan informasi buku pertama
        System.out.println("================ KERANJANG ================");
        buku1.tampilkanInfo();
        System.out.println();

        // Menampilkan informasi buku kedua
        buku2.tampilkanInfo();
        System.out.println();

        // Menampilkan informasi buku digital
        buku3.tampilkanInfo();

        // Menghitung total pembayaran
        int totalBayar = buku1.hargaAkhir()
                + buku2.hargaAkhir()
                + buku3.hargaAkhir();

        System.out.println("-------------------------------------------");
        System.out.println("Total bayar : Rp"
                + String.format("%,d", totalBayar).replace(',', '.'));
    }
}
