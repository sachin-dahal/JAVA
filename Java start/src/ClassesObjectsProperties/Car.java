package ClassesObjectsProperties;

public class Car {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();  // object

        v.name = "Tesla";  // var initialization
        v.model = 1123;
        System.out.println(v.vehicleModel());
    }
}
