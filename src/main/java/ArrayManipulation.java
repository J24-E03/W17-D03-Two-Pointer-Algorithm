
public class ArrayManipulation {
    public static void reverseTheWord(char[] word) {
        int left = 0, right = word.length - 1;
        while (left < right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
    }
    //------------>exercise 2
        public static int removeOccurrencesOfValue(int[] nums, int value) {
        int right = 0;
        for(int left = 0; left < nums.length; left++) {
            if(nums[left] != value) {
                nums[left] = nums[right];
                right++;
            }
        }
        return right;
    }

    //------------>exercise 3
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowel = "aeiouAEIOU";
        // Start looping until left and right pointers meet
        while(left < right) {
            //If chars[left] is not a vowel, indexOf() returns -1, and the condition remains true.
            while(left < right && vowel.indexOf(chars[left]) == -1) {
                left++; //so left moves forward
            }
            // // Move right backward if it's not a vowel
            while(left < right && vowel.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap the vowels found at left and right
            if(left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                // Move both pointers toward the center
                left++;
                right--;
            }

        }   // Convert the character array back to a string
        return new String(chars);

    }
    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        reverseTheWord((word));
        System.out.println(java.util.Arrays.toString(word));
        reverseTheWord(word);

        //------------>exercise 2
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int value = 3;
        System.out.println(removeOccurrencesOfValue(nums, value));

        //------------>exercise 3
        String s = "IceCreAm";
        System.out.println("Original: " + s);
        System.out.println("Reversed Vowels: " + reverseVowels(s));
    }
}
