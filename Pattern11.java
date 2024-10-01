import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.printf("%-3d",num);
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
