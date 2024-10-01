import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(ch + "  ");
                ch++;
            }
            System.out.println();
        }
    }
}
