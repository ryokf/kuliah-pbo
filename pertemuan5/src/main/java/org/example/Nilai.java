package org.example;

import java.util.Scanner;

public class Nilai {
    String nim, nama, predikat;
    double tgs, uts, uas, pTgs, pUts, pUas, nakh;
    char nHuruf;

    public Nilai(String nim, String nama, double tgs, double uts, double uas) {
        this.nim = nim;
        this.nama = nama;
        this.tgs = tgs;
        this.uts = uts;
        this.uas = uas;
    }

    public Nilai(){}

    void isiData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Tugas : ");
        tgs = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        uas = input.nextDouble();
    }

    void hitungNilai(){
        pTgs = 0.3 * tgs;
        pUts = 0.35 * uts;
        pUas = 0.35 * uas;
        nakh = pTgs + pUts + pUas;
    }

    char getNilaiHuruf(double nilai){
        if (nilai >= 85) {
            nHuruf = 'A';
        } else if (nilai >= 70 && nilai < 85) {
            nHuruf = 'B';
        } else if (nilai >= 60 && nilai < 70) {
            nHuruf = 'C';
        } else if (nilai >= 40 && nilai < 60) {
            nHuruf = 'D';
        } else {
            nHuruf = 'E';
        }
        return nHuruf;
    }

    String getPredikat(){
        String predikat;
        switch (nHuruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
                break;
        }
        return String.valueOf(predikat);
    }

    void cetakNilai(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Tugas : " + pTgs);
        System.out.println("Nilai UTS : " + pUts);
        System.out.println("Nilai UAS : " + pUas);
        System.out.println("Nilai Akhir : " + nakh);
        System.out.println("Nilai Huruf : " + getNilaiHuruf(nakh));
        System.out.println("Predikat : " + getPredikat());
    }

    public static void daftarNilai(Nilai[] daftarNilai, int jumlahData){
        System.out.println("daftar nilai");

        for (int i = 0; i < jumlahData; i++) {
            daftarNilai[i] = new Nilai();
        }

    }
}
