import java.util.*;
class repeat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s = sc.nextLine().toUpperCase().trim();
        s = s + " ";
        String three = "";
        String two = "";
        int c3 = 0;
        int c2 = 0;

        for(int i = 1; i < s.length()-1; i++) {
            if(s.charAt(i-1) == s.charAt(i) && (s.charAt(i) == s.charAt(i+1))) {
                c3++ ;
                three += " " + s.substring(i-1, i+2);
            }

            else if(s.charAt(i-1) == s.charAt(i) && (s.charAt(i) != s.charAt(i+1))) {
                 c2++;
                 two += " " + s.substring(i-1, i+1) ;
            }
        }
        System.out.println("Total count of three : "+c3);
        System.out.println("Words are : "+three);
        System.out.println("Total count of two : "+(Math.abs(c3-c2)));
        System.out.println("Words are : "+two);
        sc.close();
    }
}