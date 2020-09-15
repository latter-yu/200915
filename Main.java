import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String strs = sc.nextLine();
            char[] chars = strs.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < chars.length; i++) {
                if (!map.containsKey(chars[i])) {
                    map.put(chars[i], 1);
                } else {
                    map.put(chars[i], map.get(chars[i]) + 1);
                }
            }
            int count = 0;
            for (Map.Entry m : map.entrySet()) {
                if (count == map.size()) {
                    System.out.print(m.getKey() + "=" + m.getValue());
                } else {
                    System.out.print(m.getKey() + "=" + m.getValue() + " ");
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String strs = sc.nextLine();
            char[] chars = strs.toCharArray();
            List<ArrayList<Character>> list = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                List<Character> inputList = new ArrayList<>();
                for (int j = i; j < chars.length; j++) {
                    if (chars[j] >= '5' && chars[j] <= '8') {
                        inputList.add(chars[j]);
                    } else {
                        break;
                    }
                }
                list.add((ArrayList<Character>) inputList);
            }
            Map<ArrayList<Character>, Integer> outputMap = new HashMap<>();
            int max = 0;
            int bound = 0;
            String[] str = new String[1];
            for (ArrayList l : list) {
                if (l.size() > max) {
                    max = l.size();
                    outputMap.put(l, l.size());
                }
            }
            for (Map.Entry m : outputMap.entrySet()) {
                if (max == (int) m.getValue()) {
                    String ch = m.getKey().toString();
                    char[] chs = ch.toCharArray();
                    int len = chs.length;
                    for (int cur = 0; cur < len; cur++) {
                        if (chs[cur] >= '5' && chs[cur] <= '8') {
                            System.out.print(chs[cur]);
                        }
                    }
                }
            }
        }
    }
}
