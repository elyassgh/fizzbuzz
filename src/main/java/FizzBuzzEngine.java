public class FizzBuzzEngine {

    public static String fizzbuzz(int n) throws Exception {

        if (n == 0) throw new Exception("Invalid Argument");

        StringBuilder buffer = new StringBuilder("");

        for (int i = 0; i < n; i++) {
            buffer.append(FizzBuzzConverter.convert(i)).append(" ");
        }

        return buffer.toString();
    }

}
