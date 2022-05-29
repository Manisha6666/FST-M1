package activities;

public class Car {
    String colour;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car()
    {
        tyres = 10;
        doors = 10;
    }
    public void displayCharacteristics()
    {
        System.out.println("Colour of the car is :" + colour);
        System.out.println("Transmission of the car is :"+transmission);
        System.out.println("Make of the car is:"+make);
        System.out.println("Number of tyres in the car is:"+tyres);
        System.out.println("Number of doors in the car is:"+doors);
    }
    public void accelarate()
    {
        System.out.println("Car is moving forward.");
    }
    public void brake()
    {
        System.out.println("Car has stopped.");
    }
}
