import java.util.HashMap;
import java.util.Map;

public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0)
            return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character c: moves.toCharArray()) {
            if (c == 'L'){
                if (map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                } else {
                    map.put(c,1);
                }
            } else if (c == 'R') {
                if (map.containsKey('L')) {
                    map.put('L',map.get('L')-1);
                } else {
                    map.put('L',-1);
                }
            } else if (c == 'U') {
                if (map.containsKey(c)) {
                    map.put(c,map.get(c)+1);
                } else {
                    map.put(c,1);
                }
            } else if (c == 'D') {
                if (map.containsKey('U')) {
                    map.put('U',map.get('U')-1);
                } else {
                    map.put('U',-1);
                }
            }
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }

    public boolean judgeCircle1(String moves) {
        int x = 0;
        int y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'R') x++;
            else if (ch == 'L') x--;
        }
        return x == 0 && y == 0;
    }
}

