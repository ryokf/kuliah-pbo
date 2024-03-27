package org.example;

public class Main {
    public static void main(String[] args) {
        MahasiswaEnkapsulasi mahasiswa = new MahasiswaEnkapsulasi();
        mahasiswa.setName("Ryo khrisna fitriawan");
        mahasiswa.setNim("A11.2022.13991");
        mahasiswa.setIpk(3.5);
        mahasiswa.setAlamat("Jalan Jalan");
        mahasiswa.cetak();

//        System.out.println("sebelum membuat object");
//        System.out.println("jumlah objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());
//
//        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi(0,0);
//        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(6,7);
//        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(8,5);
//        System.out.println(pp1.getLuas());
//        System.out.println(pp1.getKeliling());
//        System.out.println(pp2.getLuas());
//        System.out.println(pp2.getKeliling());
//        System.out.println(pp3.getLuas());
//        System.out.println(pp3.getKeliling());
//
//        System.out.println("setelah membuat object");
//        System.out.println("jumlah objek : " + PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
}