import java.text.DecimalFormat;
import java.util.Scanner;

public class BT {
    public static void main(String[] args) {
        // sử dụng cấu trúc lặp để nhập vào dữ liệu vs đk:
        // nhập vào 1 chuỗi đến khi thỏa mãn đủ 12 đến 20 kí tự
        // nhập vào 1 số > 18 thì ms dưng nhập
        // nhập vào 1 kí tự đến khi nhập kí tự O
        // thì dừng và in ra những kí tự vừa nhập
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            System.out.println("Nhập chuỗi: ");
//            String s = sc.nextLine();
//            int a = s.length();
//            if (a >= 12) {
//                if (a <= 20) {
//                    System.out.println("Độ dài là : " + a);
//                    System.out.println("Chuỗi là: " + s);
//                    break;
//                }
//            } else {
//                System.out.println("Nhập lại.");
//            }
//        }


//        while (true) {
//            System.out.println("Nhập vào 1 số: ");
//            int number = sc.nextInt();
//            if (number >= 18) {
//                System.err.println("Đã quá 18. Dừng ");
//                break;
//            }
//                System.out.println("Số đã nhập: "+number);
//        }

//        String string = "";
//         do {
//            System.out.print("Nhập vào 1 kí tự: ");
//            String c = sc.nextLine();
//            if (c.length() == 1) {
//                if (c.equals("O")) {
//                    System.out.println("Đã nhập chữ O");
//                    System.out.println("Các kí tự đã nhập: " + string);
//                    break;
//                }
//                string += c;
//            } else {
//                System.err.println("Không đúng vui lòng nhập lại");
//            }
//        }while (true);


        // Khai căn và làm tròn tới 3 dấu phẩy
//        System.out.println("Nhập số muốn khai căn: ");
//        int number = new Scanner(System.in).nextInt();
//        double a = Math.sqrt(number);
//        DecimalFormat d = new DecimalFormat("#.###");
//        System.out.println(a);
//        System.out.println("Số làm tròn căn bậc hai:  " + d.format(a));

        // Tính giai thừa của 1 số
//        int b = 6;
//        int c = 1;
//        for (int i = 1; i <= b; i++) {
//            c = c * i;
//        }
//        System.out.println(c);

        // Đếm số ước của 1 số nguyên dương nhập vào
        System.out.println("Nhập vào số cần kiểm tra: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Các ước của số " + number + " là: ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ,");
                }
            }
        } else {
            System.out.println("Nhập vào số nguyên dương.");
            main(args);
        }
    }
}
