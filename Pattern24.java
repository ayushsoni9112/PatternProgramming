import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        if (n%2==0) {
            n++;
        }
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("A  ");
                } else if (i == n/2 && j == n/2) {
                    System.out.print("   ");
                } else {
                    System.out.print("B  ");
                }
            }
            System.out.println();
        }
    }
}