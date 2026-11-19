public class Latihan4 {

    static void tampilkanDaftarBarang(String[] namaBarang, int jumlahBeli) {

        System.out.println("Daftar Barang:");

        for (int i = 0; i < jumlahBeli; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i]);
        }
    }

    public static void main(String[] args) {

        String[] namaBarang = {
            "Buku",
            "Pensil",
            "Penghapus",
            "Penggaris",
            "Pulpen"
        };

        int jumlahBeli = 5;

        tampilkanDaftarBarang(namaBarang, jumlahBeli);
    }
}