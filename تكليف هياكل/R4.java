public class R4 {
    public static boolean ismultiple(long n,long m){
        return (n%m==0);
    }
    public static void main(String[]args){
        long num1=15;
        long num2=5;
        System.out.println(num1+"is a multiple of " +num2+":"+ismultiple(num1,num2));
    }
}
