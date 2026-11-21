import java.util.Scanner;

public class arr2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 10 digit number :");
        String s = sc.next();
        if (s.length() != 10) {
            System.out.println("Number is Invalid");
            System.exit(0);
        }

        int s1 = 0;
        String a[] = s.split("");
        for (int i = 0; i < a.length; i++) {
            int t = Integer.valueOf(a[i]);
            if (i % 2 != 0)
                s1 += 2 * t;
            else
                s1 += t;
        }
        System.out.println((s1 > 9) ? s1 - 9 : s1);
    }
}
