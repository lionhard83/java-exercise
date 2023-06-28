import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        Autovehicle a = new Autovehicle("Fiat punto", "AA000AA");
        Track t1 = new Track("Iveco", "AA000SD", false, false, 10000, 2);
        Track t2 = new Track("Mercedes", "AA001SD", true, false, 20000, 1);

        Autovehicle.setInsurance(200);

        Company c = new Company("Pippo");
        c.addAutovehicle(a);
        c.addAutovehicle(t1);
        c.addAutovehicle(t2);

        System.out.println(c.calcuateInsurance());

    }
}
