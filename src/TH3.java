import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số lượng các tỉ phú: ");
            number = sc.nextInt();
            if (number > 20) {
                System.out.println("Nhập trong khoảng dưới 20.");
                main(args);
            }
        } while (number > 20);
        int[] array = new int[number];
        int count = 0;
        while (count < array.length) {
            System.out.print("Tỉ phú thứ " + (count + 1) + " :");
            array[count] = sc.nextInt();
            count++;
        }
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ,");
            if (array[i] > max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println();
        System.out.println("Giá trị " + max + " nằm ở vị trí " + index);
    }
}

