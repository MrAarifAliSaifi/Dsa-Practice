import java.util.HashMap;
import java.util.Map;


public class ElementAppearTwoTime {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,33,5,7,8,3,1,4,3,6,9,4,2,33};
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int ele:arr){
            hm.put(ele, hm.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()==2){
                System.out.println(entry);
            }
        }
    }
}
