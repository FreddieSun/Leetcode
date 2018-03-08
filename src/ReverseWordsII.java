public class ReverseWordsII {
    public String reverseWords(String s) {
        String[] list = s.split(" ");
        for (int i = 0; i < list.length; i++) {
            list[i] = new StringBuilder(list[i]).reverse().toString();
        }
        StringBuilder res = new StringBuilder();
        for (String st:list) {
            res.append(st+" ");
        }
        return res.toString().trim();
    }
}
