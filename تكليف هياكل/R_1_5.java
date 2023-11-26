public class R_1_5 {

    public static void printAllPositive(int x){
       int sum=0;
        for (int i = 1; i <=x; i++) {
            sum+=i;

        }
        System.out.println(sum);

    }



    public static void main(String[]args){
        printAllPositive(5);
    }

}
