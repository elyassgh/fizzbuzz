import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzEngineTest {

    @Test(expected = Exception.class)
    public void itShouldThrowInvalidException() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(0);
    }

    @Test
    public void itShouldReturn1When1IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(1);
        assertEquals(MockData.fbFor1, result);
    }

    @Test
    public void itShouldReturn12When2IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(2);
        assertEquals(MockData.fbFor2, result);
    }

    @Test
    public void itShouldReturn12FizzWhen1IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(3);
        assertEquals(MockData.fbFor3, result);
    }

    @Test
    public void itShouldReturn12Fizz4BuzzWhen5IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(5);
        assertEquals(MockData.fbFor5, result);
    }

    @Test
    public void itShouldReturn12Fizz4BuzzWhen15IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(15);
        assertEquals(MockData.fbFor15, result);
    }
}