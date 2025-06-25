public class PalindromeString {
    public static void main(String[] args) {
        String str="oppo";
        
        String reversedString="";

        for(int i=str.length()-1;i>=0;i--){
            reversedString=reversedString+str.charAt(i);
        }
        if(str.equals(reversedString)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        StringBuilder stringBuilder= new StringBuilder(str);
        reversedString=stringBuilder.reverse().toString();
        if(str.equals(reversedString)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
