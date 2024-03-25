package tugas2;

public class Nilai {
    String nim = "A11.2022.13991";
    String nama = "Ryo khrisna fitriawan";
    double nilaiUts = 90.0;
    double nilaiTugas = 90.0;
    double nilaiUas = 90.0;
    double pNilaiUts = this.nilaiUts * 0.2;
    double pNilaiTugas = this.nilaiTugas * 0.35;
    double pNilaiUas = this.nilaiUas * 0.45;
    double nilaiAkhir;

    public void hitungNilai(){
        this.nilaiAkhir = pNilaiUts + pNilaiTugas + pNilaiUas;
    }

    public void cetakNilai(){
        System.out.println("Nilai UTS : " + this.nilaiUts);
        System.out.println("Nilai Tugas : " + this.nilaiTugas);
        System.out.println("Nilai UAS : " + this.nilaiUas);
        System.out.println("Nilai Akhir : " + this.nilaiAkhir);
    }

}
