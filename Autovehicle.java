public class Autovehicle {
    private String brand;
    private String plate;
    private static double insurance = 100;

    public Autovehicle(String brand, String plate) {
        this.brand = brand;
        this.plate = plate;
    }

    public double getInsurance() {
        return insurance;
    }

    public static void setInsurance(double newValue) {
        insurance = newValue;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.plate + " " + this.getInsurance();
    }
}
