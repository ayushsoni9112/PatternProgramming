import java.util.Scanner;

public class Pattern37 {
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
        int space = n-1;
        int star = 1;
        for (int i = 0; i < n*2-1; i++) {
            for(int j = 0; j < space; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < star; j++) {
                System.out.printf("*  ");
            }
            if (i < n-1) {
                space--;
                star++;
            } else {
                space++;
                star--;
            }
            System.out.println();
        }
    }
}
