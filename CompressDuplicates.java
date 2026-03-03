public class CompressDuplicates {
    
    static String compressDuplicates(String s) {
        if(s.length()==1) return s;
        String ans = "";
        boolean flag = true;
        int count = 1;
        for(int i = 0; i<s.length()-1; i++) {
            if(flag) {
                ans += s.charAt(i);
                flag = false;
            }
            if(s.charAt(i)==s.charAt(i+1)) {
                count++;
            } else {
                if(count>1) {
                    ans += count;
                    count = 1;
                }
                flag = true;
            }
        }
        if(s.charAt(s.length()-1) == ans.charAt(ans.length()-1)) ans+=count;
        else ans+=s.charAt(s.length()-1);
        return ans;
    }

    static String compressDuplicates2(String s) {     //Another Approach (more clean approach)
        int count = 1;
        String ans = s.charAt(0) + "";
        for(int i = 1; i<s.length(); i++) {
            if(s.charAt(i-1) == s.charAt(i)) count++;
            else {
                if(count>1) {
                   ans += count;
                   count = 1;
                }
                ans += s.charAt(i);
            }
        }
        if(count>1) ans+=count;
        return ans;
    }
    public static void main(String[] args) {
        String s = "aaabbbbccdddee";
        String ans = compressDuplicates2(s);
        System.out.println(ans);
    }
}
