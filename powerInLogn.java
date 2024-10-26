public class Main {
    public static int power(int a, int n){
        if(n==1){
            return a;
        }
        int result=power(a,n/2);
        if(n%2==0){
            return result*result;
        }
        return a*result*result;
    }
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
