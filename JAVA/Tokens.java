import java.util.*;
class Tokens {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " "); 
        String Lword = "";
        String temp = "";
        int l = 0;
        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            if (temp.length() > Lword.length()) {
                Lword = temp;
                l = Lword.length();
            }

        }
        System.out.println("Longest word: " + Lword);
        System.out.println("Length: " + l);
    }
}