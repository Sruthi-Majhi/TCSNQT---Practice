import java.util.Scanner;

public class RhymingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.nextLine();
        String[] dictionary = sc.nextLine().split(" ");
        int m = word.length();
        int n = dictionary.length;
        int maxCount = 0;
        String ans = "No Word";

        for (String s : dictionary) {
            int cnt = 0;
            int i = m - 1;
            int j = s.length() - 1;
            while (i >= 0 && j >= 0) {
                if (word.charAt(i) == s.charAt(j)) cnt++;
                else break;
                i--;
                j--;
            }
            if (cnt != m && cnt > maxCount) {
                ans = s;
                maxCount = cnt;
            }


        }

        System.out.println(ans);

    }
}
