import java.util.*;

public class Draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(getNum(a, b));
    }

    public static int getNum(String a, String b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int temp = 0;
            for (int j = i; j < i + b.length(); j++) {
                if (a.charAt(j) != b.charAt(j - i))
                    temp ++;
            }
            list.add(temp);
        }
        int sum = 0;
        for (Integer i: list) {
            sum += i;
        }
        return sum;
    }

}
