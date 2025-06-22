import java.util.Scanner;

public class GreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int  i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(n == 1) System.out.println(1);

        int cnt = 1, j = 0, greatest = 0;

        while(j < n)
        {
            if(arr[greatest] < arr[j])
            {
                greatest = j;
                cnt++;

            }
            j++;
        }

        System.out.println(cnt);

    }
}
//TC: O(N)
//SC: O(1)