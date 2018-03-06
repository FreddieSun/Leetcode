import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return s;
        String vowels = "aeiouAEIOU";
        char[] sequence = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if ((vowels).contains(s.charAt(i)+"")) {
                list.add(i);
            }
        }
        if(list.size() == 0)
            return s;
        int left = 0,right = list.size()-1;
        while(list.get(left) < list.get(right)) {
            char temp = sequence[list.get(left)];
            sequence[list.get(left)] = sequence[list.get(right)];
            sequence[list.get(right)] = temp;
            left++;
            right--;
        }
        return new String(sequence);
    }

    public String reverseVowels1(String s) {
        if(s == null || s.length() ==0)
            return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //find the first the vowels
            while (left < right && !vowels.contains(chars[left]+""))
                left++;
            while (left < right && !vowels.contains(chars[right]+""))
                right--;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(chars);

    }
}
