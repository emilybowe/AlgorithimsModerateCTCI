import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q5Test {

    Q5 q5;

    @BeforeEach
    public void init() {
        q5 = new Q5();
    }

    @Test
    public void givenFactorialResult_shouldFindTrailingZeros() {
        //given
        //when
        //then
        Assertions.assertEquals(1, q5.getTrailingZeros(5));
        Assertions.assertEquals(4, q5.getTrailingZeros(20));
    }

    @Test void givenN_shouldFindFactorialResult() {
        //given
        //when
        //then
        Assertions.assertEquals(120, q5.getFactorial(5));
        Assertions.assertEquals(2432902008176640000L, q5.getFactorial(20));
    }
}