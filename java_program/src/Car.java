public class Car extends Vehicle {

    private int acceleration_factor;
    boolean is_veteran;
    private double speed;

    public Car(double weight_kg, int horsepowers, int number_wheels, String brand, int price_usd, int acceleration_factor, boolean is_veteran) {
        super(weight_kg, horsepowers, number_wheels, brand, price_usd);

        this.acceleration_factor = acceleration_factor;
        this.is_veteran = is_veteran;
        this.speed = 0.0;

    }

    public void accelerate(int sec) {
        this.speed += this.acceleration_factor*sec;
    }

    public void decelerate(int sec) {
        if (this.speed > 0) {
            this.speed -= this.acceleration_factor*sec;
        }
    }

    public double getSpeed() {
        return this.speed;
    }



}
