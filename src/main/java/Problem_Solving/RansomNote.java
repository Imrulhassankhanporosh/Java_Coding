
// 383. Ransom Note

package Problem_Solving;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        // Array to store count of each letter in the magazine
        int [] count =new int [26];

        // Count each character in the magazine
        for(char c : magazine.toCharArray())
        {
            count[c-'a']++;  // Increment the count for the letter
        }

        // Check each character in ransomNote
        for (char c : ransomNote.toCharArray()) {
            // If the character's count is zero, it can't be used for ransomNote
            if (count[c - 'a'] == 0) {
                return false;
            }
            // Decrement the count as we're using one instance of the character
            count[c - 'a']--;
        }

        // All characters in ransomNote are available in magazine
        return true;
    }


    public static void main(String[] args) {
        RansomNote solution = new RansomNote();

        String ransomNote1 = "a";
        String magazine1 = "b";

        System.out.println("Test Case 1: " + solution.canConstruct(ransomNote1, magazine1)); // Output: false


        String ransomNote2 = "aa";
        String magazine2 = "ab";

        System.out.println("Test Case 1: " + solution.canConstruct(ransomNote2, magazine2)); // Output: false

        String ransomNote3 = "aab";
        String magazine3 = "aa";

        System.out.println("Test Case 1: " + solution.canConstruct(ransomNote3, magazine3)); // Output: true

    }

}
