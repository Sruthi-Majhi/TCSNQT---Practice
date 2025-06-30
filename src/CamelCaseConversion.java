import java.util.Scanner;

public class CamelCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length(), i = 1;
        StringBuilder ans = new StringBuilder();
        ans.append(Character.toLowerCase(str.charAt(0)));
        while(i < n)
        {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ans.append(' ');
                ans.append(Character.toLowerCase(ch));
            }
            else
            {
                ans.append(ch);
            }
            i++;
        }
        System.out.println(ans.toString());
    }
}
