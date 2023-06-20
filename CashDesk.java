public class CashDesk {
    private int[] boxes; // { 0, 0, 0, 0, 0 };
    // [0,0,0,0,0]
    private double[] coins;

    public CashDesk(double[] coins) {
        boxes = new int[coins.length];
        this.coins = coins;
    }

    public void addBanknote(int index) {
        if (index < 0 || index >= boxes.length) {
            return;
        }
        // boxes[index] = boxes[index] + 1;
        boxes[index]++;
    }

    public void removeBanknote(int index) {
        if (index < 0 || index >= boxes.length || boxes[index] <= 0) {
            return;
        }
        // boxes[index] = boxes[index] - 1;
        boxes[index]--;
    }

    public double getCashFlow() {

        double sum = 0;
        for (int index = 0; index < boxes.length; index++) {
            sum = sum + (boxes[index] * this.coins[index]);
        }
        return sum;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.boxes.length; i++) {
            s += this.coins[i] + " = " + this.boxes[i] + "\n";
        }
        s += "cashflow:" + this.getCashFlow();
        return s;
    }
}
