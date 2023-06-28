public class Track extends Autovehicle {

    private boolean isTipping;
    private boolean isFlamable;
    private double weight = 0.0;
    private int numOfTrailers = 0;

    public Track(
            String brand,
            String plate,
            boolean isTipping,
            boolean isFlamable,
            double weight,
            int numOfTrailers) {
        super(brand, plate);
        this.isFlamable = isFlamable;
        this.isTipping = isTipping;
        this.weight = weight;
        this.numOfTrailers = numOfTrailers;
    }

    @Override
    public double getInsurance() {
        // double value = super.getInsurance();
        // if (this.isFlamable) {
        // value += 300;
        // }
        // if (this.isTipping) {
        // value += 50;
        // }
        // value += this.numOfTrailers * 100;
        // value += this.weight * 0.02;
        // return value;
        return super.getInsurance() +
                (this.isFlamable ? 300 : 0) +
                (this.isTipping ? 50 : 0) +
                this.numOfTrailers * 100 +
                this.weight * 0.02;
    }
}
