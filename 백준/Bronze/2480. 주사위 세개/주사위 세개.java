import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();
        int thirdNumber = s.nextInt();

        // 같은 눈이 3개인 경우
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println(10000 + (firstNumber * 1000));
        } else if (firstNumber == secondNumber || firstNumber == thirdNumber) {
            System.out.println(1000 + (firstNumber * 100));
        } else if (secondNumber == thirdNumber) {
            System.out.println(1000 + (secondNumber * 100));
        } else {
            Map<String, Integer> map = new HashMap<>();
            map.put("1", firstNumber);
            map.put("2", secondNumber);
            map.put("3", thirdNumber);

            if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
                Object[] mapKey = map.values().toArray();
                Arrays.sort(mapKey);
                int a = (int) mapKey[2];
                System.out.println(a * 100);
            }
        }
    }
}