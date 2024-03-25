import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeat;
        do{
            Scanner myObj = new Scanner(System.in);

            System.out.print("Masukkan kode : ");
            String kode = myObj.nextLine();
            System.out.print("Masukkan nama : ");
            String nama = myObj.nextLine();
            System.out.print("Masukkan jumlah : ");
            String jumlah = myObj.nextLine();
            System.out.print("Masukkan harga : ");
            String harga = myObj.nextLine();

            Penjualan penjualan = new Penjualan(kode, nama, Integer.parseInt(jumlah), Float.parseFloat(harga));
            penjualan.cetakNota();
            System.out.print("Apakah ingin mengulang? (y/n) : ");
            String ulang = myObj.nextLine();
            repeat = ulang.equals("y");
        } while (repeat);
    }
}