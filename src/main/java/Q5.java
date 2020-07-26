import java.util.stream.LongStream;

public class Q5 {

    public int getTrailingZeros(int n) {

        long factorial = getFactorial(n);
        int trailingZerosCount = 0;

        while(factorial % 10 == 0) {
            trailingZerosCount ++;
            factorial = factorial/10;
        }
        return trailingZerosCount;
    }

    public long getFactorial(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }



}
