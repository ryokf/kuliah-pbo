package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("PROGRAM PENJUALAN");

        System.out.print("Masukkan jumlah data penjualan : ");
        int productCount = Integer.parseInt(myObj.nextLine());
        Penjualan[] products = new Penjualan[productCount];
        String[] bonus = new String[productCount];

        for(int i = 0; i < productCount; i++){
            System.out.println("--------------------");
            System.out.println("Masukkan data penjualan ke-" + (i+1));
            System.out.print("Masukkan kode : ");
            String kode = myObj.nextLine();
            System.out.print("Masukkan nama : ");
            String nama = myObj.nextLine();
            System.out.print("Masukkan jumlah : ");
            String jumlah = myObj.nextLine();
            System.out.print("Masukkan harga : ");
            String harga = myObj.nextLine();

            if(harga.isEmpty() || kode.isEmpty() || nama.isEmpty() || jumlah.isEmpty() ){
                System.out.println("Data tidak boleh kosong");
                System.out.println("Silahkan ulangi");
                i--;
                continue;
            }

            Penjualan penjualan = new Penjualan(kode, nama, Integer.parseInt(jumlah), Float.parseFloat(harga));

            products[i] = penjualan;

            System.out.print("Apakah ingin mengulang? (y/n) : ");
            String ulang = myObj.nextLine();
            if(ulang.equals("n") || ulang.equals("N")) break;
        }

        System.out.println("-----------------");
        System.out.println("Nota Penjualan");
        for(int i = 0; i < productCount; i++){
            products[i].cetakNota();
            bonus[i] = products[i].getBonus();
        }

        var totalHarga = 0.0f;
        for(int i = 0; i < productCount; i++){
            totalHarga += products[i].getTotalPembelian();
        }

        System.out.println("-----------------");
        System.out.println("Total yang perlu dibayar : " + totalHarga);

        System.out.println("Bonus yang diberikan : ");
        for(int i = 0; i < productCount; i++){
            if(!bonus[i].isEmpty()){
                System.out.println((i+1) + ". " + bonus[i]);
            }
        }
    }
}