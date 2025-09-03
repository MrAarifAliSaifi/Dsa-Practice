public class VowelsAndConsonent {
    public static void main(String[] args) {
        String str="adgywtfdgkasbsdvausvd";
        int consonent=0;
        int vowel=0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
               vowel++;
           }else {
               consonent++;
           }
       }
        System.out.println("consonent="+consonent +""+"vowel="+vowel);
    }
}
