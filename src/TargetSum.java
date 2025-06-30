import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] ans = new int[2];
        int product = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = 0, j = n - 1;
        Arrays.sort(arr);
        while(k < j)
        {
            if(arr[k] + arr[j] > 18)
                j--;
            else if(arr[k] + arr[j] < 18)
                k++;
            else {
                if(arr[k] * arr[j] > product)
                {
                    ans[0] = arr[j];
                    ans[1] = arr[k];

                }
                k++;
                j--;
            }
        }

        System.out.println("[" + ans[0] + " " + ans[1] + "]");
    }
}
