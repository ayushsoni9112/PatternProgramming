import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = n-1; j >= 0; j--) {
                if (j >= i) {
                    System.out.print("*  ");
                } else {
                    System.out.print("@  ");
                }
            }
            System.out.println();
        }
    }
}
