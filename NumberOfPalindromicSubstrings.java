public class NumberOfPalindromicSubstrings {
    
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i<j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }

    static int numOfPalindromes(String s) {
        int count = 0;
        for(int i = 0; i<s.length(); i++) {
            for(int j = i+1; j<=s.length(); j++) {
                if(isPalindrome(s.substring(i, j))) {
                    System.out.print(s.substring(i, j) + " : " + ++count);
                    System.out.println();
                }
            }
        } 
        return count;
    }
    public static void main(String[] args) {
        String s = "abba";
        System.out.println("Number of Palindromic substrings : "  + numOfPalindromes(s));
    }
}
