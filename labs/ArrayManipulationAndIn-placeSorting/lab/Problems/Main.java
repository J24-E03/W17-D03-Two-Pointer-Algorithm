package Problems;

import java.util.Arrays;


public class Main {
    public static String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static int[] removeElements(int[] nums, int val) {

        int index = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val)
                nums[index++] = nums[i];

        return Arrays.copyOf(nums, index);
    }

    // utility function to check for vowel
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }


    static String reverseVowel(String s1) {

        int j = 0;
        char[] s = s1.toCharArray();

        String vowel = "";

        for (int i = 0; i < s.length; i++) {
            if (isVowel(s[i])) {
                j++;
                vowel += s[i];
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (isVowel(s[i])) {
                s[i] = vowel.charAt(--j);
            }
        }
        return String.valueOf(s);
    }





    public static void main(String[] args) {
        // Problem 1:
        String input = "h e l l o";
        String output = reverseWords(input);
        System.out.println("Problem 1 Solved: " + output);

        // Problem 2:
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3;
        nums = removeElements(nums, val);
        System.out.println("Problem 2 Solved: " + Arrays.toString(nums));

        // Problem 3:
        String s = "IceCreAm";
        System.out.println("Problem 3 Solved: " + reverseVowel(s));

    }
}



