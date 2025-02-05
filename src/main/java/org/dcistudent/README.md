## Exercise 1: Reverse the Word in Place

**Explanation:**

1. **Initialization:**
    - Create a `char` array `word` to store the characters of the word.
    - Initialize two integer variables:
        - `left`: Points to the beginning of the array (initially 0).
        - `right`: Points to the end of the array (initially `word.length - 1`).

2. **Swapping:**
    - Use a `while` loop that continues as long as `left` is less than `right`:
        - **Swap:** Swap the characters at the `left` and `right` indices using a temporary variable:
          ```java
          char temp = word[left]; 
          word[left] = word[right];
          word[right] = temp;
          ```
        - **Move Pointers:**
            - Increment the `left` pointer: `left++`.
            - Decrement the `right` pointer: `right--`.

3. **Output:**
    - Convert the modified `char` array back into a string using `String.valueOf(word)` and print the reversed word:
        ```java
        System.out.println("Reversed word: " + String.valueOf(word)); 
        ```

## Exercise 2: Remove All Occurrences of a Value

**Explanation:**

1. **Initialization:**
    - Create an integer array `nums` and initialize the value of `val`.
    - Initialize two integer variables:
        - `slow`: Points to the next position for a non-`val` element (initially 0).
        - `fast`: Iterates through the array (initially 0).

2. **Iteration:**
    - Use a `while` loop to iterate through the array using the `fast` pointer:
        - **Check for Non-`val` Element:** If the current element at `fast` is not equal to `val`:
            - Replace the element at the `slow` index with the current element:
              ```java
              nums[slow] = nums[fast];
              ```
            - Increment the `slow` pointer: `slow++`.
        - Increment the `fast` pointer in any case: `fast++`.

3. **Output:**
    - The `slow` pointer now indicates the number of elements not equal to `val`.
    - Print the number of elements not equal to `val`:
        ```java
        System.out.println("Number of elements not equal to " + val + ": " + slow);
        ```

## Exercise 3: Reverse Vowels of a String

**Explanation:**

1. **Initialization:**
    - Convert the input string `s` into a character array `charArray`.
    - Initialize two integer pointers:
        - `left`: Points to the beginning of the `charArray` (initially 0).
        - `right`: Points to the end of the `charArray` (initially `charArray.length - 1`).

2. **Two-Pointer Approach:**
    - Use a `while` loop that continues as long as `left` is less than `right`:
        - **Find Next Vowel from Left:** Use a nested `while` loop to move the `left` pointer forward until it encounters a vowel:
          ```java
          while (left < right && !isVowel(charArray[left])) {
              left++;
          }
          ```
        - **Find Next Vowel from Right:** Use a nested `while` loop to move the `right` pointer backward until it encounters a vowel:
          ```java
          while (left < right && !isVowel(charArray[right])) {
              right--;
          }
          ```
        - **Swap Vowels:** If `left` is still less than `right` (meaning both pointers have found vowels):
          ```java
          char temp = charArray[left]; 
          charArray[left] = charArray[right];
          charArray[right] = temp;
          ```
        - **Move Pointers:**
            - Increment the `left` pointer: `left++`.
            - Decrement the `right` pointer: `right--`.

3. **Output:**
    - Convert the modified `charArray` back into a string using `String.valueOf(charArray)` and print the result:
        ```java
        System.out.println("Reversed vowels: " + String.valueOf(charArray));
        ```