import java.util.*;

public class Draft2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(min(s));
        }
    }

    public static int min (String s) {
        int[] nums = new int[s.length()];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(s.charAt(i)+"");
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // 找到最小的val值, 如果有相等的，找到最小的key，输出他，直到他==0
        int minVal = getMinValue(map);
        // 找到最小val对应的key
        int minKey = 9;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == minVal) {
                minKey= Math.min(minKey, entry.getKey());
            }
        }

        if (minKey != 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i <= minVal; i++) {
                sb.append(minKey);
            }
            return Integer.parseInt(sb.toString());
        } else {
            StringBuffer sb = new StringBuffer();
            // 找到第二小的key 和 val
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if (entry.getKey() == minKey) {
                    list.add(entry.getKey());
                }
            }
            int targetKey = 1;
            Collections.sort(list);
            if (minVal == 0) {
                sb.append(targetKey);
                sb.append(minKey);
                return Integer.parseInt(sb.toString());
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0)
                    targetKey = list.get(i);
                break;
            }
            sb.append(targetKey);
            for (int i = 0; i <= minVal; i++) {
                sb.append(minKey);
            }
            return Integer.parseInt(sb.toString());
        }
    }
    public static int getMinValue (Map<Integer, Integer> map) {
        if (map == null) return -1;
        Collection<Integer> c = map.values();
        Object[] nums = c.toArray();
        Arrays.sort(nums);
        return (Integer) nums[0];
    }

    public static int getSecondMinValue (Map<Integer, Integer> map) {
        if (map == null) return -1;
        Collection<Integer> c = map.values();
        Object[] nums = c.toArray();
        Arrays.sort(nums);
        return (Integer) nums[1];
    }
}
