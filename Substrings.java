import java.util.Scanner;

public class Substrings { 

    static void printSubstrings(String s) {
        System.out.print("Substrings : ");
        for(int i = 0; i<s.length(); i++) {
            String ss = s.substring(i);
            for(int j = 0; j<ss.length(); j++) {
                System.out.print(ss.substring(0, ss.length()-j) + " ");
            }
        }
        System.out.println();
        //OR
        System.out.print("Substrings : ");
        for(int i = 0; i<s.length(); i++) {
            for(int j = i+1; j<=s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String s = sc.next();
        printSubstrings(s);
    }
}      