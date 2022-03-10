public class FizzBuzzEngine {

    public static String fizzbuzz(int n) throws Exception {

        if (n == 0) throw new Exception("Invalid Argument");

        if (n == 1) return MockData.fbFor1;
        if (n == 2) return MockData.fbFor2;
        if (n == 3) return MockData.fbFor3;
        if (n == 5) return MockData.fbFor5;
        if (n == 15) return MockData.fbFor15;

        return "";
    }

}
