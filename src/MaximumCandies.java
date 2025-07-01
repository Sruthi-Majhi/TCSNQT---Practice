import java.util.*;

public class MaximumCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt(), cnt = 0;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

       for(int i = 0; i < n; i++)
       {
           if(arr[i] % 5 == 0)
               cnt++;
           else
           {
               if(money - arr[i] >= 0) {
                   cnt++;
                   money -= arr[i];
               }

           }

       }
        System.out.println(cnt);

    }
}
