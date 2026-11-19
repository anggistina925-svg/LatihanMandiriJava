public class Latihan3 {

    static int hitungKembalian(int uangBayar, int totalHarga) {
        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {

        int uangBayar = 50000;
        int totalHarga = 35000;

        int kembalian = hitungKembalian(uangBayar, totalHarga);

        if (uangBayar >= totalHarga) {
            System.out.println("Pembayaran berhasil");
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Uang bayar: " + uangBayar);
            System.out.println("Kembalian: " + kembalian);
        } else {
            System.out.println("Uang pembayaran kurang");
        }
    }
}