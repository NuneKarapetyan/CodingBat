package warmup_1;

//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.

public class Close10 {
    public int close10(int a, int b) {
        if (Math.abs(a - 10) > Math.abs(b - 10))
            return b;
        else if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else
            return 0;
    }
}
