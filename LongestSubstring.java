import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) { // recebe a String do metodo main "abcabcbb"
        Set<Character> set = new HashSet<>(); // cria um hashset vazio para armazenar cada letra
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) { // lenght is 7
            char c = s.charAt(right);
            System.out.println("letra atual: " + c);
            System.out.println("right: " + right);

            while (set.contains(c)) { // se o set ter a letra (c) entao avanca o ponteiro left para a direita
                set.remove(s.charAt(left)); // remove o left para nao ter que ver denovo
                System.out.println(set);
                left++;
            }
            System.out.println("left: " + left);

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
            System.out.println("maxLen: " + maxLen);
            System.out.println("Set atual: " + set);
            System.out.println("--------");

        }

        return maxLen;
    }

    // method to test
    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();

        String input1 = "abcabcbb";
        System.out.println("Input: " + input1 + " -> Output: " + solution.lengthOfLongestSubstring(input1)); // 3

    }
}
