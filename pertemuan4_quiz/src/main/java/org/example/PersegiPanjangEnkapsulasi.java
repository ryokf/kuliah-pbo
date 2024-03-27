package org.example;

public class PersegiPanjangEnkapsulasi {
    private double panjang;
    private double lebar;
    private static int jumlahObjek;


    public PersegiPanjangEnkapsulasi(double panjangBaru, double lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        jumlahObjek++;
    }

    public double getPanjang() {
        return this.panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public static int getJumlahObjek() {
        return PersegiPanjangEnkapsulasi.jumlahObjek;
    }

    public double getLuas() {
        return this.panjang * this.lebar;
    }

    public double getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}
