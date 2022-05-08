import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(st.nextToken());
            
            if (value < num2) {
                sb.append(value).append(" ");
            }
        }
        System.out.println(sb);
    }
}