
public class Bicycle {
    int speed = 0;
    int gear = 1;
    public void changeGear(int newGear){
        gear = gear + newGear;
        System.out.println("gear = " + gear);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("speed = " + speed);
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
        System.out.println("speed = " + speed);
    }
}
