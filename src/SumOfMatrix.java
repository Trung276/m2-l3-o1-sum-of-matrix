import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai ma tran:");
        int lengthX = scanner.nextInt();
        int lengthY = lengthX;
        int[][] matrix = new int[lengthX][lengthY];
        int x = 0;
        int y = 0;
        int sum = 0;

        for (int i = 0; i < lengthY; i++) {
            for (int j = 0; j < lengthX; j++) {
                System.out.print("\nHang " + i + ", phan tu thu " + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma tran ban nhap vao la:");
        for (int i = 0; i < lengthY; i++) {
            for (int j = 0; j < lengthX; j++) {
                System.out.printf(matrix[i][j] + " ");
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
            System.out.printf("\n");
        }
        System.out.println("Tong cac so o duong cheo chinh la: " + sum);
    }
}