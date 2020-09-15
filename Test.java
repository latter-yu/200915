import java.util.Stack;

public class Main {
    /**
     *
     * @param inData string字符串 请求参数
     * @return int整型
     */
    public int sort (String inData) {
        // write code here
        char[] ch = inData.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            char tmp = ch[i];
            for (int j = i; j < ch.length; j++) {
                if (ch[i + 1] < ch[i]) {
                    ch[i] = ch[i + 1];
                    ch[i + 1] = tmp;
                    count++;
                }
            }
        }
        return count;
    }
}

class Solution {
    /**
     * 数组内数据循环平移
     * @param arr int整型一维数组 输入数组
     * @param pushOffset int整型 位移长度
     * @return int整型一维数组
     */
    public static int[] pushIntArray(int[] arr, int pushOffset) {
        // 数组内数据平移

        Stack<Integer> stack = new Stack<>();
        int len = arr.length;
        for (int i = len - 1; i >= len - pushOffset - 1; i--) {
            stack.push(arr[i]);
        }
        for (int j = len - pushOffset - 2; j >= 0; j--) {
            arr[j + pushOffset] = arr[j];
        }
        int cur = 0;
        while (stack.size() != 0) {
            arr[cur] = stack.pop();
            cur++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int pushOffset = 2;
        int[] ret = pushIntArray(arr, pushOffset);
        System.out.println(ret);
    }
}