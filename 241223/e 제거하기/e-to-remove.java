import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        String str = br.readLine();
        
        int index = str.indexOf("e");
        str = str.substring(0, index) + str.substring(index + 1);

        System.out.println(str);
    }
}
