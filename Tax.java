public class Tax {
    private double amount = 0.0;

    public Tax(double a) {
        setAmount(a);
    }

    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public double getValue() {
        if (this.amount <= 10000) {
            return this.amount * 0.10;
        } else if (this.amount <= 20000) {
            return 10000 * 0.10 + (this.amount - 10000) * 0.07;
        } else if (this.amount <= 30000) {
            return 10000 * 0.10 + 10000 * 0.07 + (this.amount - 20000) * 0.05;
        } else {
            return 10000 * 0.10 + 10000 * 0.07 + 10000 * 0.05 + (this.amount - 30000) * 0.03;
        }
    }
}
