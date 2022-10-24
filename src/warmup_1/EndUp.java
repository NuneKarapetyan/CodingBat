package warmup_1;
//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars,
// uppercase whatever is there.

public class EndUp {
    public String endUp(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        } else {
            return str.toUpperCase();
        }

    }
}
