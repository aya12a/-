import java.util.Scanner;

public class smallestAndLargestNumber{
    public static void SmallestAndLargestNumber(){
        Scanner input =new Scanner(System.in);
        System.out.println("enter an integer");
        int intvalue = input.nextInt();
        System.out.println("entered integer"+intvalue);
        double doublevalue=input.nextDouble();
        System.out.println("enter double value"+doublevalue);
        System.out.println("enter the character");
        char charvalue=input.next().charAt(0);
        System.out.println("enter the character"+charvalue);
        System.out.println("enter boolean value: t or flas");
        boolean booleanvalue= input.nextBoolean();
        System.out.println("enter boolean value"+booleanvalue);
        input.close();



    }
    public static void main(String[]args){
        SmallestAndLargestNumber();}
//        public static void main(String[]args){
//            int[]arr={345,7877,89,78,34,-89,72,6,9};
//
//        private static void smallestAndLargestNumber(int[]array){
//            long smallestNumber=array[0];
//            long largestNumber=array[0];
//            for (int i=1;i<array.length;i++){
//                if (array[i]<=smallestNumber)
//                    smallestNumber=array[i];
//                else if (array[i]>=largestNumber)
//                    largestNumber=array[i];
//
//
//
//            }
//            System.out.println("smallest Number is");
//            System.out.println("largest Number is");
//
//        }
   }
