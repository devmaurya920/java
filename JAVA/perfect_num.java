import java.util.*;

class perfect_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This code find the perfect number between a range");
        System.out.println("Enter your lower limit");
        int l = sc.nextInt();
        System.out.println("Enter your upper limit");
        int u = sc.nextInt();
        int s = 0;
        System.out.println("The Numbers are :");
        for (int i = l; i <= u; i++) {
            s = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0)
                    s += k;
            }
            if (s == i)
                System.out.println(s);
        }
    }
}