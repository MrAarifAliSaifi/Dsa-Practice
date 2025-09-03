import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "I love Java and I love coding";
        String[] arr = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : arr) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        int maximumCount = 0;
        String mostFrequent = null;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maximumCount)
                maximumCount = entry.getValue();
                mostFrequent = entry.getKey();
        }
        System.out.println(mostFrequent);
    }
}
