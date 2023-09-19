import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Nhập số size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhập lại, tối đa 20.");
            }
        } while (size >= 20);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập số thứ " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " , ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Chuỗi ngược lại là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " , ");
        }

    }
}
