

public class Vehicle {

    private double weight_kg;
    private int horsepowers;
    private int number_wheels;
    private String brand;
    private int price_usd;
    public static double gravity_constant = 9.81;


    public Vehicle(double weight_kg, int horsepowers, int number_wheels, String brand, int price_usd) {

        this.weight_kg = weight_kg;
        this.horsepowers = horsepowers;
        this.number_wheels = number_wheels;
        this.brand = brand;
        this.price_usd = price_usd;
    }

    public double getVerticalNormalForce() {
        return this.weight_kg * gravity_constant;
    }

    public static double getVerticleNormalForceOfVehicle(Vehicle vehicle) {
        return vehicle.weight_kg * gravity_constant;
    }

    @Override
    public boolean equals(Object object) {

        if(object == null) {
            return false;
        }
        if(!(object instanceof Vehicle)) {
            return false;
        }
        return true;
    }
}
