import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleProgram {
    static int INSTANCE_NUMBER = 1000;
    static String[] BRANDS = { "BMW", "Audi", "VW", "Chevrolet", "Ford" };


    public static void main(String[] args) throws InterruptedException {

        ArrayList<Car> carPool = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int execution_number = 0;

        while(true) {
            execution_number++;
            System.out.print("\n\n------------------ Start execution nr: " + execution_number +" ------------------");
            System.out.print("\nPress any number and enter to start:");
            input.nextInt();
            for(int i = 0; i < INSTANCE_NUMBER; i++) {

                Random generator = new Random();
                int hp = generator.nextInt(1000) + 100;
                int weight = generator.nextInt(3000) + 1000;
                int brand_index = generator.nextInt(BRANDS.length);
                String brand = BRANDS[brand_index];

                Car new_car = new Car(weight, hp, 4, brand, 100000, 5, false);
                int time = generator.nextInt(20) + 1;
                new_car.accelerate(time);
                carPool.add(new_car);

            }

            for(Car car: carPool) {
                System.out.print("\n\nVertical normal force on 90 degree angle: " + car.getVerticalNormalForce());
                System.out.print("\nSpeed: " + car.getSpeed() + " km/h");
            }
        }

    }
}
