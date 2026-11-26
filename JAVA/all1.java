import java.util.Scanner;

public class all1 {
    Scanner sc = new Scanner(System.in);

    void Sum(int a[][], int r1, int c1) {
        // Taking input for array b
        int b[][] = new int[r1][c1];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // Doing the Sum
        int c[][] = new int[r1][c1];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing the Array B
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the Array C
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

    void Mul(int a[][], int r2, int c2) {
        // Taking input for array b
        int b[][] = new int[r2][c2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[a.length][c2];
        // Doing the Multiplication
    }

    void CornerSum(int a[][], int r1, int c1) {
        // Taking input for array b
        int b[][] = new int[r1][c1];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // Doing the Sum
        int c[][] = new int[r1][c1];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == a[0].length - 1) || (i == a.length - 1 && j == 0)
                        || (i == a.length - 1 && j == a[0].length - 1))
                    c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Printing the Array B
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the Array C
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
