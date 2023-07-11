package recursion;
import java.util.HashSet;

public class keypad1 {
    public static String[]  keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};
    
    public static void printComb(String str,int ind, String cobmination ){
        int idx;
        char[] combination;
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx); //current char nikallene ahai
        String mapping = keypad[currChar - '0'];// currenct char index pr kya store hai

        for(int i=0; i<mapping.length(); i++){
            printComb(str, idx+1, char[] combination +mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        printComb(str, 0,"");
    }
}
