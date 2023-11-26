import java.util.Scanner;
import java.util.Stack;

public class Q5 {
    static String alement[]={"aya","fhj","fhghj"};
    public static void main(String[] args) {
        display(alement);
        input(alement);
        display(alement);
    }
    public static void display(String x[]){
        for (String a: x)
        System.out.println(a);
              {

        }
    }
    public static void input(String x[]){ Scanner ee=new Scanner(System.in);
        System.out.println("enter the number");
        for (int i = 0; i <x.length ; i++) {
            x[i]= ee.next();
        }}
}
