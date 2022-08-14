import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   // 사용자 입력을 읽어들일 BufferedReader
        StringTokenizer stringTokenizer;    // 공백을 사이에 두고 날아오는 숫자를 구분해 사용하기 위한 StringTokenizer
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            stringTokenizer = new StringTokenizer(reader.readLine(), " ");
            int firstNumber = Integer.parseInt(stringTokenizer.nextToken());
            int secondNumber = Integer.parseInt(stringTokenizer.nextToken());
            // 두 숫자가 0일 경우 무한 while문 탈출
            if (firstNumber == 0 && secondNumber == 0) {
                break;
            }

            // 출력하기 위해 두 숫자 더함
            stringBuilder.append(firstNumber + secondNumber).append("\n");
        }
        System.out.println(stringBuilder);
    }
}