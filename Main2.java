public class Main2 {
    public static void main(String[] args) {
        Tax t1 = new Tax(9999);
        System.out.println(t1.getValue());
        Tax t2 = new Tax(10100);
        System.out.println(t2.getValue());
        Tax t3 = new Tax(20100);
        System.out.println(t3.getValue());
        Tax t4 = new Tax(32100);
        System.out.println(t4.getValue());
    }

}
