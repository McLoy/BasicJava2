import objects.Car;
import objects.Door;

/**
 * Created by McLoy on 21.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Toyota");
        System.out.println("Car name: " + car.getName());

        Door door = new Door();
        door.setColor("White");
        System.out.println("Door color: " + door.getColor());
    }
}
