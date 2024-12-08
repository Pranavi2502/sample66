public class Prime {
    public static void main(String[] args) {
        for (int k = 2; k <= 100; k++) {
            if (isPrime(k)) {
                System.out.print(k + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}