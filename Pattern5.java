import java.util.Scanner;

public class Pattern5 {
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
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
