import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        int n = s.nextInt();
        s.close();

        int a = h * 60 + m + n;
        h = a / 60;
        m = a % 60;

        if (h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}