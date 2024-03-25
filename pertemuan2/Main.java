import tugas1.Mobil;
import tugas2.Nilai;

public class Main{
    public static void main(String[] args) {
        Mobil ferrari = new Mobil();

        ferrari.maju();
        ferrari.mundur();
        Mobil.belok();

        System.out.println("roda : " + ferrari.roda);

        System.out.println("mesin : " + Mobil.mesin);

        // Nilai ryo = new Nilai();
        // ryo.hitungNilai();
        // ryo.cetakNilai();
    }
}


