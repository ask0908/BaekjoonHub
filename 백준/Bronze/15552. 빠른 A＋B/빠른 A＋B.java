import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(reader.readLine());

        StringTokenizer st;

        for (int i = 0; i < num; i++)
        {
            st = new StringTokenizer(reader.readLine(), " ");
            writer.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        reader.close();
        
        writer.flush();
        writer.close();
    }
}