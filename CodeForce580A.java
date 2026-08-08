import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long previous = sc.nextLong();

        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            long current = sc.nextLong();

            if (current >= previous) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
            previous = current;
        }

        System.out.println(maxLength);
    }
}