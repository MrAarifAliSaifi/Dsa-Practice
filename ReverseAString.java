public class ReverseAString {
    public static void main(String[] args) {
        String str ="Aarif";
        String reveredString ="";
        for(int i=str.length()-1;i>=0;i--){
            reveredString=reveredString+str.charAt(i);
        }
        System.out.println("Reversed String is here:"+reveredString);
    }
}
