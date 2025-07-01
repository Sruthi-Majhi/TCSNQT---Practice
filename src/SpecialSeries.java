import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;

        if( n == 0 || n == 1)
            System.out.println(1);
        for(int i = n - 1; i >= 0; i--)
        {
            if( n == 0 || n == 1)
                sum += 1;
            else sum += i * i;


        }
        System.out.println(sum%47);
    }
}
