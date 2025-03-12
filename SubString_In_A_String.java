public class SubString_In_A_String {
    public static void main(String[] args) {
        String mainStr = "Aarif Ali Saifi Son of Nasir Ali Saifi";
        String subStr = "Ali";
        if (mainStr.contains(subStr)) {
            System.out.println("'" + subStr + "' मौजूद है!");
        } else {
            System.out.println("'" + subStr + "' मौजूद नहीं है!");
        }
    }
}
