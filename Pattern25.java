import java.util.Scanner;

public class Pattern25 {
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
        int spaceOne = 0;
        int spaceTwo = 3;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i == n/2 && j == n/2) {
                    System.out.print("*  ");
                } else if (i == n/2 || j == n/2) {
                    System.out.print("A  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
