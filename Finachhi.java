public class Finachhi {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int size=10;
        int c=0;
        System.out.println(a+""+b);
        for(int i=0;i<size;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }
    }
}
