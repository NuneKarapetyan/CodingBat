package warmup_1;
//Given two int values, return their sum. Unless the two values are the same, then return double their sum.


public class SumDouble {
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
