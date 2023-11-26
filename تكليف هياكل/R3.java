public class R3 {
    public static boolean iseven(int i){
        return (i &1)==0;
    }
    public static void main(String[]args){
        int number=10;
        System.out.println(number+"is even"+iseven(number));
    }
}
