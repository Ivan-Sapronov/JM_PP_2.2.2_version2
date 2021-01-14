package web.model;

/**
 * @author Ivan Sapronov
 */
public class Car {

    private String brand;
    private String type;
    private int power;

    public Car(String brand, String type, int power) {
        this.brand = brand;
        this.type = type;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", power=" + power +
                '}';
    }
}
