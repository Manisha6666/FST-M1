package activities;

public class Activity1 {
    public static void main(String[] args)
    {
        Car maruti = new Car();
        maruti.make = 2014;
        maruti.colour = "black";
        maruti.transmission = "manual";

        maruti.displayCharacteristics();
        maruti.accelarate();
        maruti.brake();
    }
}


