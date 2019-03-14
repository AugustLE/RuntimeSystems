import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class SimpleProgram {
    static int INSTANCE_NUMBER = 250000;
    static int RUN_NUMBER = 20;
    static String[] BRANDS = { "BMW", "Audi", "VW", "Chevrolet", "Ford" };


    public static void runProgram() throws InterruptedException {
        ArrayList<Car> carPool = new ArrayList<>();
        //Scanner input = new Scanner(System.in);
        //input.next();
        //System.out.println("Starting in 20 sec");
        Thread.sleep(15000);
        long start_time = System.nanoTime();


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
                car.accelerate(5);
                //System.out.print("\n\nVertical normal force on 90 degree angle: " + car.getVerticalNormalForce());
                // System.out.print("\nSpeed: " + car.getSpeed() + " km/h");
            }
        }

        long end_time = System.nanoTime();
        long time_elapsed = end_time - start_time;
        System.out.print("Time in seconds: ");
        System.out.print(time_elapsed/1000000000);

        //System.out.println("Press Enter to stop...");
        //System.in.read();
    }



    public static void main(String[] args) throws InterruptedException, IOException {

        runProgram();
    }
}

