import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int sum = Integer.parseInt(a + b) + Integer.parseInt(b + a);
        System.out.println(sum);
    }
}
