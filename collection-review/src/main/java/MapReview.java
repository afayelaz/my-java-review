import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "David");
        map.put(2 ,"Allen");
        System.out.println(map.get(2));

        String str = "Java Developer";
        System.out.println(str +" first Non repeating char: " +firstNonRepeatingChar(str));


    }

//    public static char firstNonRepeatingChar (String str) { // char not complaining in MAP
    public static Character firstNonRepeatingChar (String str) {

        Map<Character,Integer> map = new HashMap<>(); // char Char and count Integer
        int count =0;
        for (Character ch: str.toCharArray()) {
            if(map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count+1);
            } else map.put(ch, 1);
        }
        for(Character ch :str.toCharArray()) {
            if (map.get(ch)==1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}
