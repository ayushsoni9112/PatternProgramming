import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        for (int i = n; i >= 1; i--) {
            int num = 0;
            for(int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(num+"  ");
                } else {
                    System.out.print("   ");
                }
                if (num == 1) {
                    num=0;
                } else if (num == 0) {
                    num=1;
                }
            }
            System.out.println();
        }
    }
}
