import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n" +
                "1. Fahrenheit to Celsius\n" +
                "2. Celsius to Fahrenheit\n" +
                "0. Exit ");
        System.out.println("Nhập lựa chọn: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập số nhiệt độ F là: ");
                int F = sc.nextInt();
                FC(F);
                break;
            case 2:
                System.out.println("Nhập số nhiệt độ C là: ");
                int C = sc.nextInt();
                CF(C);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Nhập lựa chọn từ 0 - 2.");
                main(args);
                break;
        }
    }

    public static void FC(int F) {
        double cd = (F - 32) * 5 / 9;
        System.out.println(F + " chuyển sang độ C là: " + cd);
    }

    public static void CF(int C) {
        double cd = (C * 9 / 5) + 32;
        System.out.println(C + " chuyển đổi sang độ F là: " + cd);
    }
}
