

/*
 * The ReclamationProject Class
 * <p>
 * @author Anthony Carta
 */
public class ReclamationProject {
    public static String doIt(final String a, final String b) {
        String aTemp = a;
        String bTemp = b;
        String c;
        if (aTemp.length() > b.length()) {
            c = aTemp;
            aTemp = bTemp;
            bTemp = c;
         }
        String r = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
