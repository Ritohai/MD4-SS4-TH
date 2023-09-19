import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        String[] name = {"Hai", "Lam", "Quang", "Kid"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên cần tìm kiếm: ");
        String search = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].toLowerCase().equals(search.toLowerCase())) {
                System.out.println("Tên " + name[i] + " ở vị trí " + i);
                check =true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhập tên khác.");
            main(args);
        }
    }
}
