public class Main3 {
    public static void main(String[] args) {
        double[] coins = { 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20 };
        CashDesk c = new CashDesk(coins);
        c.addBanknote(2);
        c.addBanknote(3);
        c.removeBanknote(0);
        c.addBanknote(9);
        c.addBanknote(-4);

        System.out.println(c);

        double[] coins2 = { 100, 50, 20, 10, 5, 2, 1, 200 };
        CashDesk c2 = new CashDesk(coins2);

        System.out.println(c2);

    }
}
