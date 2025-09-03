public class HowManyDigits {
    public static void main(String[] args) {
        int number=12345;
        int counter=0;
        while(number!=0){
             int rem=number%10;
             counter++;
             number=number/10;
        }
        System.out.println(counter);
    }
}
