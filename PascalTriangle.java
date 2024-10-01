import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:- ");
        int rows = sc.nextInt();
        createPascleTriangle(rows);
        sc.close();
    }
    public static void createPascleTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int comp = 1;
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(comp + "  ");
                comp = comp * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}