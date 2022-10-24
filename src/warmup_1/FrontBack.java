package warmup_1;
//Given a string, return a new string where the first and last chars have been exchanged.

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() > 1) {
            int n = str.length();
            return (str.charAt(n - 1) + str.substring(1, n - 1) + str.charAt(0));
        } else {
            return str;
        }
    }
}
