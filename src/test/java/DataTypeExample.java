import java.util.ArrayList;

public class DataTypeExample {

    /**
    * This is an example class
    * */

    public static void main(String[] args) {

        Car carOne = new Car(4, 2, 4, "B", false, "Honda", "ASDF3456");
        Car carTwo = new Car(4, 2, 4, "B", false, "Honda", "ASDF3456");
        Car carNnn = new Car(4, 2, 4, "B", false, "Honda", "ASDF3456");

        carOne.setDoors(2);
        carOne.setFullDomain("DFDGFDGFDFD");


        carOne.getBrand();
        carOne.getDoors();
        carOne.getCHASIS_NUM();

        ArrayList<Car> carArrayList = new ArrayList<Car>();

        carArrayList.add(carOne);
        carArrayList.add(carTwo);
        carArrayList.add(carNnn);
    }
}
