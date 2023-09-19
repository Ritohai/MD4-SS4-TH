import java.util.Arrays;
import java.util.Scanner;

public class TH5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tổng số mảng :");
        int number = sc.nextInt();
        int[] arrayx = new int[number];
        int count = 0;
        while (count < arrayx.length) {
            System.out.print("Nhập vị trí thứ " + (count + 1) + " :");
            arrayx[count] = sc.nextInt();
            count++;
        }
        int index = miniValue(arrayx);
        System.out.println(Arrays.toString(arrayx));
        System.out.println("Giá trị nhỏ nhất ở vị trí: " + arrayx[index]);
    }

    public static int miniValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
