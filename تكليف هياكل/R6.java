public class R6 {
    public static int sumo(int n){
        int sum=0;
        for (int i=1;i<=n;i+=2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[]args){
        int n=10;
        int result=sumo(n);
        System.out.println("sum of odd positive"+n+" is "+result);
    }
}