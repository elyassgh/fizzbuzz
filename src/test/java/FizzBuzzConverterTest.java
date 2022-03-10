import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class FizzBuzzConverterTest {

    Random random = new Random();


    @Test
    public void itShouldReturn1When1isGiven() {
        String result = FizzBuzzConverter.convert(1);
        assertEquals(String.valueOf("1"), result);
    }

    @Test
    public void itShouldReturnFizzWhen3isGiven() {
        String result = FizzBuzzConverter.convert(3);
        assertEquals(String.valueOf("Fizz"), result);
    }

    @Test
    public void itShouldReturnBuzzWhen5isGiven() {
        String result = FizzBuzzConverter.convert(5);
        assertEquals(String.valueOf("Buzz"), result);
    }


    @Test
    public void itShouldReturnFizzBuzzWhen15isGiven() {
        String result = FizzBuzzConverter.convert(15);
        assertEquals(String.valueOf("FizzBuzz"), result);
    }

    @Test
    public void itShouldReturnFizzBuzzWhenMultipleOf15isGiven() {
        String result = FizzBuzzConverter.convert(15 * random.nextInt(20));
        assertEquals(String.valueOf("FizzBuzz"), result);
    }
}
