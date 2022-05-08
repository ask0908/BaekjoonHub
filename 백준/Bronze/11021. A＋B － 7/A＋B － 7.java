import java.io.*;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());

        StringTokenizer stringTokenizer;

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine(), " ");
            writer.write("Case #" + (i + 1) + ": "
                    + (Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken()))
                    + "\n");
        }
        reader.close();

        writer.flush();
        writer.close();
    }
}