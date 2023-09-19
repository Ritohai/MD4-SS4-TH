import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số lưọng sinh viên: ");
            number = sc.nextInt();
            if (number > 30) {
                System.out.println("Quá số lượng, yêu cầu nhập dưới 30 người.");
                main(args);
            }
        }
        while (number > 30);
        int count = 0;
        int[] array = new int[number];
        while (count < number) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Sinh viên thứ " + (i + 1) + " :");
                array[i] = sc.nextInt();
                count++;
            }
        }
        int counts = check(array);
        System.out.println("Số lượng sinh viên qua môn là: " + counts);
    }

    public static int check(int[] arrays){
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] >= 5){
                count++;
            }
        }

        return count;
    }
}

