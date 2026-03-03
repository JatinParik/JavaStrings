import java.util.Scanner;

public class ToggleAllCharactersOfAString {
    
    static String toggle(String s) {
      //We can also use : StringBuilder str = new StringBuilder(s); and made changes in s and then write s = str;
      String str = "";
      for(int i = 0; i<s.length(); i++) {
        char ch = s.charAt(i);
        if(ch<=57) {      
            str += ch;    //Concatenate numeral characters and spaces as it is
            continue;
        }
        if(ch<=90) {     //ch is capital 
            ch += 32;   //A -> a
            str += ch;
        } else {       //ch is small
            ch -= 32;    //a -> A
            str += ch;
        }
      }
      return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String s = sc.nextLine();
        System.out.println("Output : " + toggle(s));
    }
}
