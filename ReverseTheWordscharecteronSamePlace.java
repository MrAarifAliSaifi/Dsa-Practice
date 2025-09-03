public class ReverseTheWordscharecteronSamePlace {
    public static void main(String[] args) {
        String str = "I love my India";
        String result = "";
        String[] words = str.split(" ");

        for (String word : words) {
            int i = 0;
            int j = word.length() - 1; // should be word.length not words.length
            char[] ch = word.toCharArray();
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            System.out.println("Here is the systematic way to upload the the document");

            result = result + new String(ch) + " "; // add reversed word to result
        }

        System.out.println(result.trim()); // remove extra last space
    }
}
