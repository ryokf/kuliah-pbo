package org.example;

public class MahasiswaEnkapsulasi {
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public MahasiswaEnkapsulasi() {}

    public MahasiswaEnkapsulasi(String nim) {
        this.nim = nim;
    }

    public MahasiswaEnkapsulasi(String nim, String nama, String alamat, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.ipk = ipk;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getName() {
        return this.nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return this.ipk;
    }

    public String predikat(double ipk){
        if (this.ipk >= 3.51 && this.ipk <= 4.0) {
            return "dengan pujian";
        } else if (this.ipk >= 2.76 && this.ipk <= 3.5) {
            return "sangat memuaskan";
        } else if (this.ipk >= 2.0 && this.ipk <= 2.75) {
            return "memuaskan";
        } else {
            return "-";
        }
    }

    public void cetak() {
        System.out.println("NIM: " + this.nim);
        System.out.println("NAMA: " + this.nama);
        System.out.println("ALAMAT: " + this.alamat);
        System.out.println("IPK: " + this.ipk);
        System.out.println("PREDIKAT: " + this.predikat(this.ipk));
    }
}
