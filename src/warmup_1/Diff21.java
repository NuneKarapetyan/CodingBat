package warmup_1;
//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

public class Diff21 {
    public int diff21(int n) {
        int result;
        if (n <= 21) {
            result = 21 - n;
        } else {
            result = (n - 21) * 2;
        }
        return result;
    }
}
