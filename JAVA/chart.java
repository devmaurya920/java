public class chart {
    public static void main(String args[]) {
        char ch = 'A';
        boolean s1 = false;
        char sc = ' ';
        // s1 = Character.isLetter(ch);
        s1 = Character.isDigit(ch);
        s1 = Character.isUpperCase(ch) ;
        s1 = Character.isLowerCase(ch) ;
        s1 = Character.isLetterOrDigit(ch) ;
        s1 = Character.isWhitespace(ch); // if ch == ' ' 

        sc = Character.toLowerCase(ch);
        sc = Character.toUpperCase(ch);
        System.out.println(s1);
    }
}
