public class ReverseEachWordInAString {
    
    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s + " ");
        int i = 0;
        for(int j = 0; j<sb.length(); j++) {
            if(sb.charAt(j)==' ') {     // i to j-1 is a word
                int st = i, end = j-1; 
                while(st<end) {
                    char ch = sb.charAt(st);
                    sb.setCharAt(st, sb.charAt(end));
                    sb.setCharAt(end, ch);
                    st++;
                    end--;
                }
            i = j+1;   
            }
        }
        return sb+"";
    }

    static String reverseWords2(String s) {     //Another Approach
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)==' ') {
                sb.reverse();
                ans += sb + " ";
                sb.delete(0, sb.length()); // or we can also write sb = new StringBuilder();
            } else {
                sb.append(s.charAt(i));   //Append characters in sb until we get a space
            }
        }
        sb.reverse();
        ans += sb + "";
        return ans;
    }
    public static void main(String[] args) {
        String s = "Hey you will reverse of each word in this sentense";
        String op = reverseWords2(s);
        System.out.println(op);
    }
}
