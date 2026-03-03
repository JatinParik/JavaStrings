import java.util.Scanner;

public class ToggleAllCharactersOfAStringBuilder {
    
    static void toggle(StringBuilder s) {
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)<=57) continue;  //Avoid changes in any numeral character and space
            if(s.charAt(i)<=90) {    //Current character is captial
                char ch = (char)(s.charAt(i) + 32);   //A -> a
                s.setCharAt(i, ch);
            } else {      //Current character is small
                char ch = (char)(s.charAt(i) - 32);  //a -> A
                s.setCharAt(i, ch);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        toggle(s);
        System.out.println("Output : " + s);
    }
}
