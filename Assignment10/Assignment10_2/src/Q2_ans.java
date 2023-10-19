import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q2_ans {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Salman");
        list.add("Ashish");
        list.add("Girish");
        list.add("Hrishikesh");
        list.add("Shubham");

        class StringComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                int diff = o1.length() - o2.length();
                return diff;
            }
        }

        String longestString = Collections.max(list, new StringComparator());

        System.out.println("List of strings: " + list);
        System.out.println("String with the highest length: " + longestString);
    }
}
