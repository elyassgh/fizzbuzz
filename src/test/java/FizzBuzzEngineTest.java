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
        assertEquals(ExpectedData.fbFor1, result);
    }

    @Test
    public void itShouldReturn12When2IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(2);
        assertEquals(ExpectedData.fbFor2, result);
    }

    @Test
    public void itShouldReturn12FizzWhen3IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(3);
        assertEquals(ExpectedData.fbFor3, result);
    }

    @Test
    public void itShouldReturn12Fizz4BuzzWhen5IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(5);
        assertEquals(ExpectedData.fbFor5, result);
    }

    @Test
    public void itShouldReturn12Fizz4BuzzWhen15IsGiven() throws Exception {
        String result = FizzBuzzEngine.fizzbuzz(15);
        assertEquals(ExpectedData.fbFor15, result);
    }
}