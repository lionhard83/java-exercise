import java.util.ArrayList;

public class Company {
    public String name;
    private ArrayList<Autovehicle> autovehicles = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addAutovehicle(Autovehicle a) {
        this.autovehicles.add(a);
    }

    public double calcuateInsurance() {
        double sum = 0;
        // for (int i = 0; i < this.autovehicles.size(); i++) {
        // Autovehicle a = this.autovehicles.get(i);
        // sum += a.getInsurance();
        // }
        for (Autovehicle a : this.autovehicles) {
            sum += a.getInsurance();
        }
        return sum;
    }

}
