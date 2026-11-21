// Tokens are defined as set of characters between simulatenous white spaces of Delimeters 
// Delimeter = " " this ks a cat ,   Apple, banan, mango 
//'Ai bots normal text conversation limit exceeed utna toek s , code karme tokens , 
import java.util.*;

class tk
{
    public static void main(String[] args) {
        String sen = "Apple    Mango Banana.   is a  fruit";
         StringTokenizer st = new StringTokenizer(sen , "//s+"); // str tokens str -2 delimeter default space  "
         // countToken() int 
         
         int n = st.countTokens();
         System.out.println(n);
         // nextToken()

         for(int i = 1; i <= n; i++)
         {
         System.out.println(st.nextToken());
        }

       // hasMoreTokens() 

    }
}

