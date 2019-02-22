import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleProgram {
    static int INSTANCE_NUMBER = 1000;
    static int RUN_NUMBER = 20;
    static String[] BRANDS = { "BMW", "Audi", "VW", "Chevrolet", "Ford" };


    public static void main(String[] args) throws InterruptedException, IOException {

        ArrayList<Car> carPool = new ArrayList<>();
        //Scanner input = new Scanner(System.in);
        //input.next();
        System.out.println("Starting in 20 sec");
        Thread.sleep(20000);

        for (int k = 0; k < RUN_NUMBER; k++) {

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


        System.out.println("Press Enter to stop...");
        System.in.read();

    }
}
