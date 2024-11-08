import java.util.Scanner;

public class Pattern41 {
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
        int s_star = 1;
        int e_star = n-1;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < s_star || j >= e_star)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
            if (i < n/2) {
                s_star++;
                e_star--;
            } else {
                s_star--;
                e_star++;
            }
        }
    }
}
