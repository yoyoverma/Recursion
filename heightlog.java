package recursion;
public class heightlog {
    public static int calcPower(int x, int n) {
        if(n==0){  //base case 1
            return 1; 
        }
        if(x==0){
            return 0; //base 2
        }
        if(n%2==0){
        return calcPower(x, n/2) * calcPower(x, n/2); //for even
        } // for odd
        else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String args[]){
        int x= 2, n=5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
