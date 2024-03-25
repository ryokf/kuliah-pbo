public class Matematika {
    void pertambahan(double a, double b){
        System.out.println(a + b);
    }

    void pengurangan(double a, double b){
        System.out.println(a - b);
    }

    void perkalian(double a, double b){
        System.out.println(a * b);
    }

    void pembagian(double a, double b){
        if(b == 0 ){
            System.out.println("tidak bisa dibagi 0");
        }else {
            System.out.println(a / b);
        }
    }
}
