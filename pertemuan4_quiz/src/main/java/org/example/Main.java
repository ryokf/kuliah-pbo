package org.example;

public class Main {
    public static void main(String[] args) {
        MahasiswaEnkapsulasi mahasiswa = new MahasiswaEnkapsulasi();
        mahasiswa.setName("Ryo khrisna fitriawan");
        mahasiswa.setNim("A11.2022.13991");
        mahasiswa.setIpk(3.5);
        mahasiswa.setAlamat("Jalan Jalan");
        mahasiswa.cetak();
    }
}