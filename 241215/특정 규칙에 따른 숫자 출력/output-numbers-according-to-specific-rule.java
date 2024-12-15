import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static int n;

    public static void main(String[] args) throws Exception {
        input();
        solution();
    }

    public static void solution() {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for(int i = 1; i <= n; i++) {
            // 공백 출력
            for(int j = 1; j <= i - 1; j++) {
                sb.append("  ");
            }
            // 숫자 출력
            for(int j = n - i + 1; j >= 1; j--) {
                sb.append(cnt + " ");
                cnt++;
                
                if(cnt >= 10) {
                    cnt = 1;
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void input() throws Exception {
        n = Integer.parseInt(br.readLine());
    }
}