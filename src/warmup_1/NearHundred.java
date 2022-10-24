package warmup_1;
//Given an int n, return true if it is within 10 of 100 or 200.

public class NearHundred {
    public boolean nearHundred(int n) {
        if (n <= 110 && n >= 90) {
            return true;
        }
        return n <= 210 && n >= 190;
    }
}
