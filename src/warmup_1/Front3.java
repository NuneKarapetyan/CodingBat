package warmup_1;
//Given a string, we'll say that the front is the first 3 chars of the string.
//If the string length is less than 3, the front is whatever is there.
// Return a new string which is 3 copies of the front.

public class Front3 {
    public String front3(String str) {
        String arr;
        if (str.length() > +3) {
            arr = str.substring(0, 3);
        } else {
            arr = str;
        }
        return arr + arr + arr;
    }
}
