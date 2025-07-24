/*
 the question come first is that if the string is an ASCII string or 
 a Unicode string, this shows that I have a strong foundation in computer science and for simplicity now just gonna think that this is an ASCII.
 If it is not valid we need to increase the storage size.class 01isUnique 
     

 One solution is create an array of boolean values, 
 where the flag at index i indicates whethere 
 character i in the alphabet is contained in the string
 
 and second time you see the character you can immediately
 return false

 */

 /*
  * check if a string has all unique characters.
  *this implementation assume the character set is standard ASCII(128 characters). 
  *it is uses boolean array to track which charcters have been seen
  * @param str the input string to check
  * @return true if the string contains only unique characters, false otherwise.
  */


public class isUnique {

    public static boolean isUniqueChars(String str){
        // If the string's length is greater than the number of possible unique characters (128 for ASCII),
        // it's impossible for all characters to be unique. This is a quick optimization.
        // OPTIMIZATION: Check based on the Pigeonhole Principle.
        // The character set is assumed to be standard ASCII, which has 128 characters.
        // If the string is longer than 128 characters, it MUST contain a duplicate.
        if (str.length() > 128) {
            return false;// Immediately return false to save time.
    }
    // ALGORITHM SETUP: Create a "checklist" for ASCII characters.
        // This is a boolean array where each index corresponds to an ASCII character code (0-127).
        // By default, all values are 'false', meaning we haven't seen any characters yet.
    boolean[] char_set = new boolean[128];
    // ALGORITHM EXECUTION: Loop through each character of the string.
    for(int i = 0; i<str.length(); i++){
        // Get the integer ASCII value of the character at the current position.
            // For example, 'a' is 97, 'b' is 98, etc.
        int val = str.charAt(i);
        // THE CORE CHECK: Use the character's ASCII value as an index into our array.
            // If char_set[val] is already 'true', it means we have seen this character before.
        if (char_set[val]) {// A duplicate was found, so the string is not unique.
            return false;

        }
        // MARKING THE CHARACTER: If the character is new, mark it as "seen".
            // We set its corresponding position in the checklist to 'true'.
        char_set[val] = true;
    }
    // CONCLUSION: If the loop finishes without finding any duplicates,
        // it means every character in the string was unique.
    return true;


}

/**
     * This is the main method, which is the entry point for any Java application.
     * The code inside this block will be executed when the program runs.
     *
     * @param args Command line arguments (not used in this program).
     */
public static void main(String[] args) {
    // Example usage with two test strings.
    String test1 = "hello";
    String test2 = "abcDEF123";

    // Test the first string and print the result.
    System.out.println("Is \"" + test1 + "\" unique? " + isUniqueChars(test1)); // Expected output: false

    // Test the second string and print the result.
    System.out.println("Is \"" + test2 + "\" unique? " + isUniqueChars(test2)); // Expected output: true
}
}
 
 