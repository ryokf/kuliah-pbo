public class Penjualan {
    String kode;
    String nama;
    int qty;
    float harga;

    public Penjualan(String kode, String nama, int qty, float harga) {
        this.kode = kode;
        this.nama = nama;
        this.qty = qty;
        this.harga = harga;
    }

    public int  getTotalPembelian() {
        return qty * (int) harga;
    }

    public String getBonus() {
        if (this.getTotalPembelian() >= 500000 && qty > 5) {
            return "Setrika";
        } else if (this.getTotalPembelian() >= 100000 && qty > 3) {
            return "Payung";
        } else if (this.getTotalPembelian() >= 50000 || qty > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    public void cetakNota(){
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Qty : " + qty);
        System.out.println("Harga : " + harga);
        System.out.println("Total : " + getTotalPembelian());
        System.out.println("Bonus : " + getBonus());
    }

}
