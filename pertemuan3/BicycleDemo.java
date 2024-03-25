public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.changeGear(2);
        bike.speedUp(3);
        bike.changeGear(3);
        bike.speedUp(4);
        bike.applyBrakes(1);
        bike.speedUp(5);
        bike.changeGear(1);
        bike.speedUp(6);
        bike.applyBrakes(2);
        bike.changeGear(4);
        bike.speedUp(7);
        bike.applyBrakes(3);
        bike.changeGear(5);
        bike.speedUp(8);
        bike.applyBrakes(4);
    }
}
