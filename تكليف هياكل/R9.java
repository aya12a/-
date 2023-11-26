public class R9 {
    public static String remove(String s){
        StringBuilder sb=new StringBuilder();
        for (char c : s.toCharArray()){
            if (character.isLetterOrDigit(c)||character.isWhitespace(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String input="Let's try,mike!";
        String result=remove(input);
        System.out.println("number of vowels in the given"+result);
    }
}
