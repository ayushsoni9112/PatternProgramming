import java.util.Scanner;

public class Pattern42 {
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
        int mid = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < mid && j == 0 || i == mid || j == mid || i == 0 && j > mid || i == n-1 && j < mid || i > mid && j == n-1)
                    System.out.print("*  ");   
                else 
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
