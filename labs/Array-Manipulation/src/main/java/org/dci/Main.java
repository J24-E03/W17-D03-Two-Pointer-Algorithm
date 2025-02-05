package org.dci;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Problem 1:  Reverse the Word in Place");
        task1();

        System.out.println("\nProblem 2: Remove All Occurrences of a Value");
        task2();

        System.out.println("\nProblem 3: Reverse Vowels of a String");
        task3();
    }



    public static void task1() {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("The characters representing a word: " + Arrays.toString(word));
        System.out.println("Reverse characters: " + Arrays.toString(reverseWord(word)));
    }

    public static char[] reverseWord(char[] word) {
        int left = 0;
        int right = word.length - 1;

        while (left < right){
            char temp = word[right];
            word[right] = word[left];
            word[left] = temp;
            left++;
            right--;
        }

        return word;

    }

    public static void task2() {
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        System.out.println("Array of numbers: " + Arrays.toString(nums));
        System.out.println("Remaining elements count: " + removeOccurrences(nums, 3));
        System.out.println("Modified array: " + Arrays.toString(nums));
    }

    public static int removeOccurrences(int[] nums, int val) {
        int currentIndex = 0;
        int nextIndex = nums.length - 1;

       while (currentIndex <= nextIndex) {
           if (nums[currentIndex] == val) {
               if (nums[nextIndex] != val) {
                   nums[currentIndex]  = nums[nextIndex];
                   nums[nextIndex] = val;
                   currentIndex++;
               }
               nextIndex--;

           } else {
               currentIndex++;
           }

       }
        return currentIndex;
    }

    public static void task3() {
        String word = "IceCreAm";
        System.out.println("Word: " + word);
        System.out.println("Word after reversing the vowels: " + reverseVowels(word));
    }

    public static String reverseVowels(String word) {
        char[] wordChars = word.toCharArray();

        int left = 0;
        int right = wordChars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            if (vowels.indexOf(wordChars[left]) != -1) {
                if (vowels.indexOf(wordChars[right]) != -1) {
                    char temp = wordChars[left];
                    wordChars[left] = wordChars[right];
                    wordChars[right] = temp;
                    left++;
                }
                right--;
            } else {
                left++;
            }
        }
        return new String(wordChars);
    }
}