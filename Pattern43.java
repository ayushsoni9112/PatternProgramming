import java.util.Scanner;

public class Pattern43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(minimum 7):- ");
        int n = sc.nextInt();
        if (n%2==0) {
            n++;
        }
        createPattern(n);
        sc.close();
    }
    public static void createPattern(int n) {
        int n1;
        if (n < 20) {
            n1 = 3;
        } else {
            n1 = 7;
        }
        int num = (n/2)-1;
        for (int i = 0; i < n-num; i++) {
            for (int j = 0; j < n+num; j++) {
                if (j >= n1 && j < n-n1)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
            if (i < n1)
                n1--;
            else 
                n1++;
        }
    }
}
