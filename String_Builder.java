public class String_Builder {
    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.append("World"); //HelloWorld
        System.out.println(str);
        str.append(12);  //HelloWorld12
        System.out.println(str);
        str.setCharAt(2, 'y');  //HeyloWorld12
        System.out.println(str);
        str.insert(2, "XYZ"); //HeXYZyloWorld12
        System.out.println(str);
        str.deleteCharAt(5);  //HeXYZloWorld12
        System.out.println(str);
        str.delete(2, 5);  //HeloWorld12  (2 to 4 will delete)
        System.out.println(str);
        str.reverse();    //21dlroWoleH
        System.out.println(str);
        System.out.println(str.substring(3, 6));
        System.out.println(str.indexOf("o"));
    }
}
