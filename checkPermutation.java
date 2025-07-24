

import java.util.Arrays;

public class checkPermutation {


    /* a helper method
     * that sorts the character of a string. 
     * @param s the input String.
     * @return a new string with the characters of the input str
     * 
     */
    private static String sortString(String s){
        ///converts the String to a character Array
        /// 
        char[] content = s.toCharArray();
        //
        Arrays.sort(content);
        return new String(content);
    }
    /**
     * Checks if string t is a permutation of string s.
     * This comparison is case-sensitive and whitespace is significant.
     * @param s The first string.
     * @param t The second string.
     * @return true if t is a permutation of s, false otherwise.
     */
    public static boolean isPermutation(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        // sort both Strings and check if they are equal 
        //if they are permutations, they will become identical once sorted
        return sortString(s).equals(sortString(t));
    }
   

    
    public static void main(String[] args) {
        String[][] pairs = {
            {"apple", "papel"},   {"carrot", "tarroc"}, 
            {"hello", "llloh"},
            {"dog", "God"}, // Case-sensitive
            {" a bc ", "bca  "} // Whitespace-sensitive
        };


        for(String[] pair : pairs){
            String word1 = pair[0];
            String word2 = pair[1];
            boolean result = isPermutation(word1, word2);
            System.out.println("\"" + word1 + "\", \"" + word2 + "\": " + result);

        }
        
    }
}
