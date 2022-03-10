public class FizzBuzzConverter {

    public static String convert(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 5 == 0) return "Buzz";
        if (n % 3 == 0) return "Fizz";
        return String.valueOf(n);
    }

}
