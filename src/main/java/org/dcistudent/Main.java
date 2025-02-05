package org.dcistudent;

public class Main {
  public static void main(String[] args) {
    new Main();
  }

  /**
   * Lab: Array Manipulation and In-place Sorting (Java)
   *
   * Objective:
   * The goal of this lab is to practice working with arrays and applying
   * in-place algorithms.
   * You will solve three problems involving array manipulation: reversing an
   * array in place, removing a specific element from an array, and sorting an
   * array with specific constraints.
   */
  public Main() {
    Main.exercise1();
    Main.exercise2();
    Main.exercise3();
  }

  /**
   * 1. Reverse the Word in Place
   *
   * Description:
   * Given an array of characters representing a word, reverse the word in place
   * without creating a new array. You can create new variables, but the array
   * itself must be rearranged in place.
   *
   * For example:
   * Input: ['h', 'e', 'l', 'l', 'o']
   * Output: ['o', 'l', 'l', 'e', 'h']
   *
   * Requirements:
   * The array must be reversed in place.
   * No new array can be created.
   * You are allowed to create new variables for tracking indices or performing
   * swaps.
   *
   * Hint:
   * Use a two-pointer technique to swap elements from both ends of the array
   * towards the middle.
   *
   * Instructions:
   * - Implement an in-place solution to reverse the array of characters.
   * - Use a two-pointer technique to swap elements from both ends of the array
   *   towards the center.
   * - Ensure the array is modified in place.
   */
  private static void exercise1() {
    char[] word = {'h', 'e', 'l', 'l', 'o'};

    // Initialize two pointers:
    // - 'left' starts at the beginning of the array
    // - 'right' starts at the end of the array
    int left = 0;
    int right = word.length - 1;

    // Continue swapping until the pointers meet or cross each other
    while (left < right) {
      // Swap characters at the 'left' and 'right' indices
      char temp = word[left];
      word[left] = word[right];
      word[right] = temp;

      // Move pointers towards the center
      left++;
      right--;
    }

    // Print the reversed word
    System.out.println("Reversed word: " + String.valueOf(word));
  }

  /**
   * 2. Remove All Occurrences of a Value
   *
   * Description:
   * Given an integer array nums and an integer val, remove all occurrences of
   * val in the array in place. The order of the remaining elements may be
   * changed. Then, return the number of elements in the array that are not
   * equal to val.
   *
   * For example:
   * Input: nums = [3, 2, 2, 3, 4, 5, 3], val = 3
   * Output: 4 (The first 4 elements are now [2, 2, 4, 5]).
   *
   * Requirements:
   * Modify the array in place.
   * The remaining elements should not be in any specific order.
   * Return the number of elements that are not equal to val.
   *
   * Hint:
   * Use a two-pointer technique where one pointer tracks the current index and
   * the other tracks where the next valid element should go.
   *
   * Instructions:
   * - Implement an in-place solution to remove all occurrences of the given
   *   value.
   * - Use a two-pointer approach to shift elements and remove the unwanted
   *   value.
   * - Return the count of elements that are not equal to the given value.
   */
  private static void exercise2() {
    int[] nums = {3, 2, 2, 3, 4, 5, 3};
    int val = 3;

    // Initialize two pointers:
    // - 'slow' points to the next position for a non-val element
    // - 'fast' iterates through the array
    int slow = 0;
    int fast = 0;

    // Iterate through the array
    while (fast < nums.length) {
      // If the current element is not equal to 'val'
      if (nums[fast] != val) {
        // Replace the element at 'slow' with the current element
        nums[slow] = nums[fast];
        slow++;
      }
      fast++;
    }

    // 'slow' now indicates the number of elements not equal to 'val'
    System.out.println("Number of elements not equal to " + val + ": " + slow);
  }

  /**
   * 3. Reverse Vowels of a String
   *
   * Description:
   * Given a string s, reverse only all the vowels in the string and return it.
   * The vowels are 'a', 'e', 'i', 'o', 'u' (both lowercase and uppercase).
   *
   * For example:
   * s = "IceCreAm"
   */
  private static void exercise3() {
    String s = "IceCreAm";
    char[] charArray = s.toCharArray();

    // Initialize two pointers:
    // - 'left' starts at the beginning
    // - 'right' starts at the end
    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {
      // Find the next vowel from the left
      while (left < right && !isVowel(charArray[left])) {
        left++;
      }

      // Find the next vowel from the right
      while (left < right && !isVowel(charArray[right])) {
        right--;
      }

      // Swap the vowels
      if (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
      }

      // Move pointers
      left++;
      right--;
    }

    // Convert charArray back to a String
    String reversedVowels = String.valueOf(charArray);
    System.out.println("Reversed vowels: " + reversedVowels);
  }

  // Helper function to check if a character is a vowel
  private static boolean isVowel(char c) {
    return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
  }
}