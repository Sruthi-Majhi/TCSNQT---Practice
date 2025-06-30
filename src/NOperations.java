import java.util.Scanner;

public class NOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        long sum = 0;
        final int MOD = 1_000_000_007;

        for (int i = 0; i < n; i++) {
            long option1 = Long.MIN_VALUE;
            long option2 = Long.MIN_VALUE;
            long option3 = -B[i];

            // Option 1: Decrease X and Y, apply formula
            if (x > 0 && y > 0) {
                option1 = compute(A[i], x - 1, y - 1, z, MOD);
            }

            // Option 2: Decrease Y and Z, apply formula
            if (y > 0 && z > 0) {
                option2 = compute(A[i], x, y - 1, z - 1, MOD);
            }

            // Choose max
            if (option1 >= option2 && option1 >= option3) {
                sum = (sum + option1) % MOD;
                x--;
                y--;
            } else if (option2 >= option1 && option2 >= option3) {
                sum = (sum + option2) % MOD;
                y--;
                z--;
            } else {
                sum = (sum + option3) % MOD;  // add MOD to prevent negative result
            }
        }

        System.out.println(sum);
    }

    // Computes A[i] * x * y * z % MOD safely
    public static long compute(int a, int x, int y, int z, int MOD) {
        long val = 1L * a % MOD;
        val = (val * x) % MOD;
        val = (val * y) % MOD;
        val = (val * z) % MOD;
        return val;
    }
}
