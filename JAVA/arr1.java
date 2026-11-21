import java.util.Scanner;

class arr1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of array");
        int sz = sc.nextInt();
        System.out.println("Enter your array elements");
        int a[] = new int[sz];
        for (int i = 0; i < sz; i++)
            a[i] = sc.nextInt();
        System.out.println("Original Array : ");
        for (int i = 0; i < sz; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        int count = 0;
        int b[] = new int[sz];
        int t = 0;
        for (int i = 0; i < sz; i++) {
            t = 0;
            for (int j = 0; j < sz; j++) {
                if (a[i] == b[j])
                    t++;
            }
            if (t == 0) {
                b[count] = a[i];
                count++;
            }
        }
        int c[] = new int[count];
        for (int i = 0; i < count; i++)
            c[i] = b[i];
        System.out.println("Array after removing duplicates :");
        for (int i = 0; i < count; i++)
            System.out.print(c[i] + " ");

    }
}