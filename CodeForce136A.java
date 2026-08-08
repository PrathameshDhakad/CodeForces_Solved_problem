import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int receiver = sc.nextInt();
            p[receiver] = i;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(p[i] + " ");
        }
    }
}