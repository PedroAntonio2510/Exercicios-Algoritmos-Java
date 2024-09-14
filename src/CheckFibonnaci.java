public class CheckFibonnaci {

    public static boolean isFibonnaci(int number) {
        int first = 0;
        int second = 1;

        if (number == 0 || number == 1) {
            return true;
        }

        int next = first + second;
        while (next <= number) {
            if (next == number) {
                return true;
            }
            first = second;
            second = next;
            next = first + second;
        }
        return false;

    }
}
