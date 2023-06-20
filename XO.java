public class XO {

    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                countX++;
            } else if (s.charAt(i) == 'o') {
                countO++;
            }
        }
        return countO == countX;
    }
}