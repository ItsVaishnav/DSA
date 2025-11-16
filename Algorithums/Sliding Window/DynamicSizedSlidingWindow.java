import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DynamicSizedSlidingWindow {
    public static void main(String[] args) {
        String str = "abcabcd";
        HashSet<Character> set = new HashSet<>();
        int target = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                target++;
                set.add(ch);
            }else{
                set.remove(ch);
                set.add(ch);
            }
        }
        System.out.println(set);
    }
}
