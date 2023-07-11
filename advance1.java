package recursion;
public class advance1{
    public static void printPermutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i =0; i<str.length(); i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0,i)+ str.substring(i+1); // in substring ending index willl not //
            //be include means in abc index of a=0 so 0 of 0 char is a so means str.substring(0,i) = a and str.substring(i+1)=c 
            //when curr char is b 
            printPermutation(newStr, permutation+currChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printPermutation(str, "");
    }
}