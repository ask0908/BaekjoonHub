import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();
        int needTime = s.nextInt();
        s.close();

        int targetTime = (hour * 60) + minute + needTime;
        hour = targetTime / 60;
        minute = targetTime % 60;

        // 시간이 24보다 크게 나올 수 있어 틀렸다고 나온다. 이 경우 처리를 해줘야 한다
        if (hour >= 24) {
            hour -= 24;
        }
        System.out.println(hour + " " + minute);
    }
}