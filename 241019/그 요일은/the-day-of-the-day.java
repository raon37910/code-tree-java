import java.util.Scanner;

public class Main {

    public static int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();
        int cnt = 0;
        int start = getTotalDay(m1, d1);
        int end = getTotalDay(m2, d2);

        for(int i = start; i <= end; i++) {
            int diff = (i - start) % 7;
            if(getPlusDay(diff).equals(day)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static int getTotalDay(int m, int d) {
        int ans = 0;

        for(int x = 1; x < m; x++) {
            ans += num_of_days[x];
        }

        return ans + d;
    }

    public static String getPlusDay(int diff) {
        String[] rets = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        return rets[diff];
    }
}