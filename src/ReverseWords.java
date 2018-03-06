import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String origin = "ni zai     sad  dsadas d   d ";
        String[] reverse = origin.split("\\s+"); // \\ 代表空格，换行符 回车， +代表可以为多个
        for(String s: reverse)
            System.out.println(reverse[1]);
    }
}
