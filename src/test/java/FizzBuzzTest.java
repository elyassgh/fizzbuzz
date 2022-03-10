import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzbuzzShouldReturnEmptyString() {
        String result = FizzBuzz.fizzbuzz(1);
        assertEquals(String.valueOf("1 "), result);
    }


}