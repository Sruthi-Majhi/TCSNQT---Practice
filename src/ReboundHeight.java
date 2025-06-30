import java.util.Scanner;

public class ReboundHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int V = sc.nextInt();
        int Vn = sc.nextInt();
        double velocityRatio = (double)V/Vn;
        double reboundHeight = H * velocityRatio * velocityRatio;
        System.out.println((int)reboundHeight);

    }
}
