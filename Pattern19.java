import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        for (int i = n; i >= 1; i--) {
            char ch = 'A';
            for(int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(ch + "  ");
                }
                ch++;
            }
            System.out.println();
        }
    }
}
