import java.util.*;

class repeat {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter your String");  
    String s = sc.nextLine().toUpperCase().trim();  

    String three = "";  
    String two = "";  

    int c3 = 0;  
    int c2 = 0;  

    for(int i = 0, j = i+1; i < s.length();i=j) {  

         

        while(j < s.length() && s.charAt(i) == s.charAt(j)) {  
            j++;  
        }  

        int count = j - i;  

        if(count == 3) {  
            c3++;  
            three += " " + s.substring(i, j);  
        }  
        else if(count == 2) {  
            c2++;  
            two += " " + s.substring(i, j);  
        }  

          
    }  

    System.out.println("Total count of three : " + c3);  
    System.out.println("Words are : " + three);  

    System.out.println("Total count of two : " + c2);  
    System.out.println("Words are : " + two);  

    sc.close();  
}

}
