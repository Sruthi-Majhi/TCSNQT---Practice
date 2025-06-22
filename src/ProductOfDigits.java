import java.util.*;
import java.lang.*;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cpy = n;
        int product = 1;
        while(cpy > 0)
        {
            int rem = cpy % 10;
            product *= rem;
            cpy = cpy / 10;

        }
        System.out.println(product);
    }
}
//Since we’re dealing with decimal digits directly, the time complexity is best described as O(log₁₀ N).