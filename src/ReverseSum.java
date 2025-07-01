import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int [] arr = new int [n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n / 2; i++)
        {
            arr[i] = arr[i] ^ arr[n - 1 - i];
            arr[n - 1- i] =arr[i] ^ arr[n - 1 - i];
            arr[i] = arr[i] ^ arr[n - 1 - i];
        }

        for(int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
                sum += arr[i];
        }
        System.out.println(sum);
    }
}
