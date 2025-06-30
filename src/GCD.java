import java.util.Scanner;

public class GCD {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = calculateGCD(A , B);
        System.out.println(ans);

    }

    public static int calculateGCD(int A, int B)
    {
        if(A == 0) return B;
        return calculateGCD(B % A, A);

    }
}
