public class Palindrome {
    public static void main(String[] args) {
        int number=81;
        boolean isPalindrome=true;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
               isPalindrome=false;
               break;
            }
        }
        System.out.println(isPalindrome);
    }
}
