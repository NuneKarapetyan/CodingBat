package warmup_1;

//Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
