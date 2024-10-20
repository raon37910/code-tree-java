import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for(int j = x1; j <= x2; j++) {
                arr[j]++;
            }
        }

        int ans = arr[1];
        for(int i = 1; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }

        System.out.println(ans);
    }
}