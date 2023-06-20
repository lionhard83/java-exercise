import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int writeTest = 0;
        int praticeTest = 0;
        do {
            System.out.println("Inserisci il voto dello scritto");
            writeTest = scanner.nextInt();
        } while (writeTest < -8 || writeTest > 8);

        do {
            System.out.println("Inserisci il voto pratico");
            praticeTest = scanner.nextInt();
        } while (praticeTest < 0 || praticeTest > 24);

        Exam e1 = new Exam();
        System.out.println(e1.getResult());

        e1.setPraticeTest(6);
        e1.setWriteTest(8);
        System.out.println(e1.getResult());

        Exam e2 = new Exam(writeTest, praticeTest);
        System.out.println(e2.getResult());

        scanner.close();
    }
}