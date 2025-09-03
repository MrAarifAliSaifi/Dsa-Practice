public class String2AppearesInString1 {
    public static void main(String[] args) {
        String str="Hello My Name is aarif Ali Saifi Hello I m from Mbd";
        String str2="Hello";
        int counter=0;
        String[] stArray=str.split(" ");
        for(int i=0;i< stArray.length;i++){
            if(stArray[i].equals(str2)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
