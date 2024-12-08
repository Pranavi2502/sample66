public class Prime {
    public static void main(String[] args) {
        for (int k = 2; k <= 100; k++) {
            if (isPrime(k)) {
                System.out.print(k + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int numm) {
        for (int i = 2; i <= Math.sqrt(numm); i++) {
            if (numm % i == 0) {
                return false;
            }
        }
        return true;
    }
}