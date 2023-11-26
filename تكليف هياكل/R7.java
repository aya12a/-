public class R7 {
    public static int sumo(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }
    public static void main(String[]args){
        int n=5;
        int result=sumo(n);
        System.out.println("sum of odd positive"+n+" is "+result);
    }
}
