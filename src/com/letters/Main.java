// Java program to count vowels letters in string, and print if vowels more Yes, if consonants more No, or
// if amount is the same - print Same

package com.letters;

// Main class
public class Main {

    static void checkString(String s) {
        int v = 0;
        int c = 0;
        int sign = 0;

        for(int index = 0; index < s.length(); index++){
            if(s.charAt(index) ==' '| s.charAt(index) =='.' | s.charAt(index) ==','| s.charAt(index) =='!'){
                sign++;
                continue;
            }
            if (s.charAt(index) == 'a' | s.charAt(index) == 'e'| s.charAt(index) == 'i' |
                    s.charAt(index)=='o' | s.charAt(index) == 'u'| s.charAt(index) == 'y'){
                v++;
            }
    }

        c = s.length() - v - sign;

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
}

    // Main method to run java program
    public static void main(String[] args) {

        // String to count vowels and consonants
        String str = "a i u e o t m n s w";

        // Calling method checkString(String s)
        checkString(str); // Output: same

        // String to count vowels and consonants
        String str1 = "Hello World!";

        // Calling method checkString(String s)
        checkString(str1); // Output: No

        // String to count vowels and consonants
        String str2 = "hou hou";

        // Calling method checkString(String s)
        checkString(str2); // Output: Yes
    }
}