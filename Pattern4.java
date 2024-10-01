import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Coloumn:- ");
        int col = sc.nextInt();
        System.out.print("Enter number of row:- ");
        int row = sc.nextInt();
        createPattern(col, row);
        sc.close();
    }
    public static void createPattern(int col, int row) {
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                System.out.print("("+i+","+ j + ")  ");
            }
            System.out.println();
        }
    }
}
