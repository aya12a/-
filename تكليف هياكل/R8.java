public class R8 {
    public static int Count(String input){
        int count=0;
        for (int i=0;i<input.length();i++){
            char ch=input.toLowerCase().charAt(i);
            if (ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        String input="hello word";
        int result=Count(input);
        System.out.println("number of vowels in the given"+result);
    }
}
