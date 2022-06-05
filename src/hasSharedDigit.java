public class hasSharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,21));
    }

    public static boolean hasSharedDigit (int numberA, int numberB) {
        if (numberA < 10 || numberA > 99 || numberB < 10 || numberB > 99) {
            return false;
        } else {

            int firstDigitOfNumberA = numberA / 10;
            int secondDigitOfNumberA = numberA % 10;
            int firstDigitOfNumberB = numberB / 10;
            int secondDigitOfNumberB = numberB % 10;

            if (firstDigitOfNumberA == firstDigitOfNumberB || firstDigitOfNumberA == secondDigitOfNumberB || secondDigitOfNumberA == firstDigitOfNumberB || secondDigitOfNumberA == secondDigitOfNumberB) {
                return true;
            }
            return false;
        }
    }

}
